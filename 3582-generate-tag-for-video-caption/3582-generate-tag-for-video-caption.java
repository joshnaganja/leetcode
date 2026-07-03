class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();

        if (caption.isEmpty()) {
            return "#";
        }

        String[] words = caption.split("\\s+");

        StringBuilder sb = new StringBuilder();
        sb.append('#');
        sb.append(words[0].toLowerCase());

        for (int i = 1; i < words.length; i++) {
            sb.append(Character.toUpperCase(words[i].charAt(0)));
            sb.append(words[i].substring(1).toLowerCase());
        }

        if (sb.length() > 100) {
            sb.setLength(100);
        }

        return sb.toString();
    }
}