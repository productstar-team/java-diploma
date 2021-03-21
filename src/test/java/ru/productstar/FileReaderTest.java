package ru.productstar;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class FileReaderTest {
    private FileReader fileReader = new FileReader("quiz.txt");
    @Test
    public void testReadsFile() {
        assertNotNull(fileReader.readFile());
    }
}