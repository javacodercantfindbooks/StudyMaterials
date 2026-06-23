package org.data.networking;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
/**
 * <h2>HTTP Made Simple</h2>
 *
 * <h3>Common HTTP Request Methods</h3>
 * <ul>
 *   <li><b>GET</b> – Retrieve a resource. Safe and idempotent. No request body.</li>
 *   <li><b>POST</b> – Create a new resource or submit data. Not idempotent. Has a request body.</li>
 *   <li><b>PUT</b> – Replace a resource entirely. Idempotent. Has a request body.</li>
 *   <li><b>DELETE</b> – Remove a resource. Idempotent. Usually no request body.</li>
 *   <li><b>PATCH</b> – Partially update a resource. Not necessarily idempotent.</li>
 *   <li><b>HEAD</b> – Like GET but returns only headers (no body). For checking existence/headers.</li>
 *   <li><b>OPTIONS</b> – Ask which methods are allowed on a resource.</li>
 * </ul>
 *
 * <h3>HTTP Status Codes (common ranges)</h3>
 * <ul>
 *   <li><b>1xx Informational</b> – Request received, continue.</li>
 *   <li><b>2xx Success</b> – Action succeeded: 200 OK, 201 Created, 204 No Content.</li>
 *   <li><b>3xx Redirection</b> – Further action needed: 301 Moved Permanently, 302 Found, 304 Not Modified.</li>
 *   <li><b>4xx Client Error</b> – The client did something wrong: 400 Bad Request, 401 Unauthorized,
 *       403 Forbidden, 404 Not Found, 405 Method Not Allowed, 409 Conflict.</li>
 *   <li><b>5xx Server Error</b> – The server failed: 500 Internal Server Error, 502 Bad Gateway,
 *       503 Service Unavailable.</li>
 * </ul>
 *
 * <h3>Frequently Used HTTP Headers</h3>
 * <ul>
 *   <li><b>Content-Type</b> – Media type of the request/response body (e.g., "application/json", "text/html").</li>
 *   <li><b>Accept</b> – Media types the client can handle (e.g., "application/json").</li>
 *   <li><b>Authorization</b> – Credentials for authentication (Bearer token, Basic auth).</li>
 *   <li><b>User-Agent</b> – Information about the client application.</li>
 *   <li><b>Cache-Control</b> – Directives for caching (e.g., "no-cache").</li>
 *   <li><b>Location</b> – Used in redirections (3xx) to indicate the new URL.</li>
 *   <li><b>Cookie / Set-Cookie</b> – Session tracking.</li>
 * </ul>
 *
 * <p>This class demonstrates {@link HttpURLConnection} – the built‑in Java HTTP client.</p>
 */
public class HttpURLConnectionDemo {
    /**
     * Opens an {@link HttpURLConnection} to the given URL.
     * No network request is made yet.
     */
    public static HttpURLConnection openConnection(String url) throws IOException {
        URL u = new URL(url);
        HttpURLConnection conn = (HttpURLConnection) u.openConnection();
        return conn;
    }
    /** Sets the request method (e.g., "GET", "POST", "PUT", "DELETE"). */
    public static HttpURLConnection setRequestMethod(HttpURLConnection conn, String method) throws IOException {
        conn.setRequestMethod(method);
        return conn;
    }
    /** Sets a request header (e.g., "Content-Type", "application/json"). */
    public static HttpURLConnection setRequestProperty(HttpURLConnection conn, String key, String value) {
        conn.setRequestProperty(key, value);
        return conn;
    }
    /** Enables output (required for sending a request body). */
    public static HttpURLConnection setDoOutput(HttpURLConnection conn, boolean doOutput) {
        conn.setDoOutput(doOutput);
        return conn;
    }
    /** Sets the connect timeout (milliseconds). */
    public static HttpURLConnection setConnectTimeout(HttpURLConnection conn, int timeout) {
        conn.setConnectTimeout(timeout);
        return conn;
    }
    /** Sets the read timeout (milliseconds). */
    public static HttpURLConnection setReadTimeout(HttpURLConnection conn, int timeout) {
        conn.setReadTimeout(timeout);
        return conn;
    }
    /**
     * Sends a plain‑text string as the request body.
     * Must have setDoOutput(true) and a suitable request method (usually POST).
     */
    public static HttpURLConnection sendRequestBody(HttpURLConnection conn, String body) throws IOException {
        try (OutputStream os = conn.getOutputStream()) {
            os.write(body.getBytes(StandardCharsets.UTF_8));
            os.flush();
        }
        return conn;
    }
    /** Returns the HTTP status code (e.g., 200, 404). */
    public static int getResponseCode(HttpURLConnection conn) throws IOException {
        return conn.getResponseCode();
    }
    /** Returns the HTTP status message (e.g., "OK", "Not Found"). */
    public static String getResponseMessage(HttpURLConnection conn) throws IOException {
        return conn.getResponseMessage();
    }
    /** Reads the response body and returns it as a single string. */
    public static String readResponseBody(HttpURLConnection conn) throws IOException {
        InputStream stream;
        try {
            stream = conn.getInputStream(); // success
        } catch (IOException e) {
            stream = conn.getErrorStream(); // error responses (4xx / 5xx)
        }
        if (stream == null) return "";

        StringBuilder result = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                result.append(line).append(System.lineSeparator());
            }
        }
        return result.toString().trim();
    }
    /** Returns the value of a specific response header (e.g., "Content-Type"). */
    public static String getHeaderField(HttpURLConnection conn, String name) {
        return conn.getHeaderField(name);
    }
    /** Closes the underlying connection and releases resources. */
    public static void disconnect(HttpURLConnection conn) {
        if (conn != null) {
            conn.disconnect();
        }
    }
    // ------------------------------------------------------------
    // Demo: a simple GET request to a public test endpoint
    // ------------------------------------------------------------

    /**
     * Demonstrates a complete GET request to a public test API (httpbin.org).
     * Returns the status code and the first 200 characters of the response.
     */
    public static String demoGet() {
        HttpURLConnection conn = null;
        try {
            conn = openConnection("https://httpbin.org/get");
            setRequestMethod(conn, "GET");
            setConnectTimeout(conn, 3000);
            setReadTimeout(conn, 3000);
            int code = getResponseCode(conn);
            String body = readResponseBody(conn);
            String preview = body.length() > 200 ? body.substring(0, 200) + "..." : body;
            return "Status: " + code + " " + getResponseMessage(conn) + "\nBody preview: " + preview;
        } catch (IOException e) {
            return "Request failed: " + e.getMessage();
        } finally {
            disconnect(conn);
        }
    }
}
