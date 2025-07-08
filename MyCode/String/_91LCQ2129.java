class _91LCQ2129 {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            int len = word.length();

            if (len <= 2) {
                result.append(word.toLowerCase());
            } else {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase());
            }
            result.append(" ");
        }

        return result.toString().trim(); // Trim to remove the trailing space
    }
}
