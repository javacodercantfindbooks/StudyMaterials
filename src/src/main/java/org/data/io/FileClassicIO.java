package org.data.io;

import java.io.*;

public class FileClassicIO {
    /** Returns true if the file or directory denoted by the path exists. */
    public static boolean fileExists(String path) {
        return new File(path).exists();
    }
    /** Returns true if the path denotes a directory. */
    public static boolean isDirectory(String path) {
        return new File(path).isDirectory();
    }
    /** Returns true if the path denotes a normal file. */
    public static boolean isFile(String path) {
        return new File(path).isFile();
    }
    /** Returns the length of the file in bytes, or 0 if the file does not exist. */
    public static long fileLength(String path) {
        return new File(path).length();
    }
    /** Creates the directory specified by the path (including necessary parent directories). */
    public static boolean mkdirs(String path) {
        return new File(path).mkdirs();
    }
    /** Deletes the file or empty directory. Returns true if successful. */
    public static boolean delete(String path) {
        return new File(path).delete();
    }
    /** Returns an array of names of files and directories in the given directory. */
    public static String[] listDirectory(String path) {
        return new File(path).list();
    }
    /** Returns true if the application can read the file. */
    public static boolean canRead(String path) {
        return new File(path).canRead();
    }
    /** Returns true if the application can write to the file. */
    public static boolean canWrite(String path) {
        return new File(path).canWrite();
    }
    /** Reads the entire content of a text file into a String (character by character). */
    public static String readWithFileReader(String path) throws IOException {
        StringBuilder content = new StringBuilder();
        try (FileReader reader = new FileReader(path)) {
            int c;
            while ((c = reader.read()) != -1) {
                content.append((char) c);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return content.toString();
    }
    /** Writes a string to a file using FileWriter (overwrites existing content). */
    public static void writeWithFileWriter(String path, String text) throws IOException {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(text);
        }
    }
    /** Reads all lines from a text file using BufferedReader and returns them as a list. */
    public static String[] readLines(String path) throws IOException {
        java.util.List<String> lines = new java.util.ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        }
        return lines.toArray(new String[0]);
    }
    /** Writes an array of lines to a file, one line per row, using BufferedWriter. */
    public static void writeLines(String path, String[] lines) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        }
    }
    /** Reads all bytes from a file and returns them as a byte array. */
    public static byte[] readBytes(String path) throws IOException {
        try (FileInputStream in = new FileInputStream(path)) {
            return in.readAllBytes();   // Java 9+
        }
    }
    /** Writes a byte array to a file (overwrites). */
    public static void writeBytes(String path, byte[] data) throws IOException {
        try (FileOutputStream out = new FileOutputStream(path)) {
            out.write(data);
        }
    }
    /** Copies a file byte-by-byte using FileInputStream / FileOutputStream. */
    public static void copyFile(String source, String dest) throws IOException {
        try (FileInputStream in = new FileInputStream(source);
             FileOutputStream out = new FileOutputStream(dest)) {
            byte[] buffer = new byte[4096];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
        }
    }
}
