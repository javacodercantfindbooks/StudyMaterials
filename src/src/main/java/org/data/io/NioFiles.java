package org.data.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.stream.Stream;

public class NioFiles {
    /** Creates a Path from a string (or multiple strings). */
    public static Path getPath(String first, String... more) {
        return Paths.get(first, more);
    }
    /** Returns true if the file or directory exists. */
    public static boolean exists(Path path) {
        return Files.exists(path);
    }
    public static boolean isRegularFile(Path path) {
        return Files.isRegularFile(path);
    }
    /** Returns true if the path is a directory. */
    public static boolean isDirectory(Path path) {
        return Files.isDirectory(path);
    }
    /** Returns the size of the file in bytes. */
    public static long size(Path path) throws IOException {
        return Files.size(path);
    }
    /** Returns the last modified time of the file. */
    public static String getLastModifiedTime(Path path) throws IOException {
        return Files.getLastModifiedTime(path).toString();
    }
    /** Reads all lines from a text file into a List. */
    public static List<String> readAllLines(Path path) throws IOException {
        return Files.readAllLines(path);
    }
    /** Reads the entire file as a single String (Java 11+). */
    public static String readString(Path path) throws IOException {
        return Files.readString(path);
    }
    /** Writes a list of lines to a file (overwrites). */
    public static Path writeLines(Path path, List<String> lines) throws IOException {
        Files.write(path, lines);
        return path;
    }
    /** Writes a string to a file (Java 11+). */
    public static Path writeString(Path path, String content) throws IOException {
        Files.writeString(path, content);
        return path;
    }
    /** Returns a Stream of lines for lazy reading (must be closed!). */
    public static Stream<String> lines(Path path) throws IOException {
        return Files.lines(path);
    }
    /** Copies a file or directory (non‑empty dirs not supported without options). */
    public static Path copy(Path source, Path target) throws IOException {
        return Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
    /** Moves (renames) a file or directory. */
    public static Path move(Path source, Path target) throws IOException {
        return Files.move(source, target, StandardCopyOption.REPLACE_EXISTING);
    }
    /** Deletes a file or an empty directory. */
    public static boolean delete(Path path) throws IOException {
        return Files.deleteIfExists(path);
    }
    /** Creates a directory (only if parent exists). */
    public static Path createDirectory(Path dir) throws IOException {
        return Files.createDirectory(dir);
    }
    /** Creates a directory and any missing parents. */
    public static Path createDirectories(Path dir) throws IOException {
        return Files.createDirectories(dir);
    }
    /** Lists all entries in a directory (non‑recursive). */
    public static Stream<Path> list(Path dir) throws IOException {
        return Files.list(dir);
    }
    /** Walks the file tree starting from the given path (recursive). */
    public static Stream<Path> walk(Path start) throws IOException {
        return Files.walk(start);
    }
    /** Returns the MIME type (content type) of a file (e.g., "text/plain"). */
    public static String probeContentType(Path path) throws IOException {
        return Files.probeContentType(path);
    }
    /** Returns true if two paths point to the same file. */
    public static boolean isSameFile(Path path1, Path path2) throws IOException {
        return Files.isSameFile(path1, path2);
    }
    /** Creates a temporary file and returns its path. */
    public static Path createTempFile(String prefix, String suffix) throws IOException {
        return Files.createTempFile(prefix, suffix);
    }
}
