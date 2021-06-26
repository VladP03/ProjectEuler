import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        List<String> nameList = readNamesFromFile();

        if (nameList != null) {
            Collections.sort(nameList);

            Map<String, Integer> namesValue = new HashMap<>();
            for (int i=0;i<nameList.size();i++) {
                namesValue.put(nameList.get(i), strScore(nameList.get(i))*(i+1));
            }

            //printMap(namesValue);
            System.out.println(totalSocre(namesValue));
        }
    }

    public static List<String> readNamesFromFile () {
        File file;
        BufferedReader br;

        try {
            file = new File(/* PATH TO FILE */);
            br = new BufferedReader(new FileReader(file));
        } catch (FileNotFoundException ex) {
            System.out.println("File not found!.");
            return null;
        }

        List<String> nameList = new LinkedList<>();
        try {
            String allNames;
            while ((allNames = br.readLine()) != null) {
                allNames = allNames.replace("\"", "");
                String[] names = allNames.split(",");

                nameList.addAll(Arrays.asList(names));
            }
        } catch (IOException ex) {
            System.out.println("Something happened while processing file!");
            return null;
        }

        return nameList;
    }

    public static int strScore(String name)
    {
        int score = 0;
        name = name.toLowerCase();

        for (int i = 0; i < name.length(); i++) {
            score += name.charAt(i) - 'a' + 1;
        }

        return score;
    }

    public static void printMap(Map<String, Integer> map) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static BigInteger totalSocre(Map<String, Integer> map) {
        BigInteger score = new BigInteger(String.valueOf(0));

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            score = score.add(BigInteger.valueOf(Long.parseLong((String.valueOf(entry.getValue())))));
        }

        return score;
    }
}
