import java.util.*;

public class karaokeInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> singers = Arrays.stream(scanner.nextLine().split(", ")).toList();
        List<String> allSongs = Arrays.stream(scanner.nextLine().split(", ")).toList();
        List<String> awardList = new ArrayList<>();
        Map<String, List<String>> data = new LinkedHashMap<>();
        String command = scanner.nextLine();
        while (!command.equals("dawn")){
            String [] array = command.split(", ");
            String name = array[0];
            String song = array[1];
            String award = array[2];

            if(allSongs.contains(song)){
                data.put(name, new ArrayList<>());
                data.get(name).add(0, song);
                data.get(name).add(1, award);
                    if(!awardList.toString().contains(award)){
                        awardList.add(award);
                        data.get(name).add(award);
                    }


            }

            command = scanner.nextLine();
        }
        }
    }

