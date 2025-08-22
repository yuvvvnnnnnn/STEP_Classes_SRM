public class problem3{
    public static String findLongestName(String[] names) {
        String longest = "";
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        for (String name : names) {
            if (Character.toLowerCase(name.charAt(0)) == Character.toLowerCase(letter)) {
                count++;
            }
        }
        return count;
    }

    public static String[] formatNames(String[] names) {
        String[] formattedNames = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" ");
            formattedNames[i] = parts[1] + ", " + parts[0];
        }
        return formattedNames;
    }

    public static void main(String[] args) {
        String[] students = {"John Smith", "Alice Johnson", "Bob Brown", "Carol Davis", "David Wilson"};
        
        System.out.println("Longest Name: " + findLongestName(students));
        System.out.println("Names starting with 'A': " + countNamesStartingWith(students, 'A'));
        
        String[] formattedStudents = formatNames(students);
        System.out.println("Formatted Names:");
        for (String student : formattedStudents) {
            System.out.println(student);
        }
    }
}
