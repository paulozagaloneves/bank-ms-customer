package com.itsector.bank.app.util;

import java.util.zip.CRC32;
import java.util.zip.Checksum;

public class Utils {

	public static long crc32(String input) {
        byte[] bytes = input.getBytes();
        Checksum checksum = new CRC32(); // java.util.zip.CRC32
        checksum.update(bytes, 0, bytes.length);

        return checksum.getValue();
    }
	
}
