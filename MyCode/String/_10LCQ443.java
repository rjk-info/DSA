class _10LCQ443 {
    public int compress(char[] chars) {
        int write = 0;     // Where we write compressed characters
        int read = 0;      // Traverses the array

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count how many times currentChar repeats
            while (read < chars.length && chars[read] == currentChar) {
                count++;
                read++;
            }

            // Write the character
            chars[write++] = currentChar;

            // Write the count if > 1
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }
}
