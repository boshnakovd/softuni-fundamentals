import java.util.*;

public class pianist_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int piecesCount = Integer.parseInt(scanner.nextLine());
        Map<String, List<String>> piecesMap = new LinkedHashMap<>();

        for (int i = 1; i <= piecesCount; i++) {
            String[] piecesData = scanner.nextLine().split("\\|");
            String piece = piecesData[0];
            String composer = piecesData[1];
            String key = piecesData[2];

            List<String> composerKey = new ArrayList<>();
            composerKey.add(composer);
            composerKey.add(key);
            piecesMap.put(piece, composerKey);
        }
        String input = scanner.nextLine();
        while (!input.equals("Stop")) {
            String[] commandData = input.split("\\|");
            String command = commandData[0];
            String piece = commandData[1];

            switch (command) {
                case "Add":
                    String composer = commandData[2];
                    String key = commandData[3];
                    if (piecesMap.containsKey(piece)) {
                        System.out.printf("%s is already in the collection!%n", piece);
                    } else {
                        List<String> newPiece = new ArrayList<>();
                        newPiece.add(composer);
                        newPiece.add(key);
                        piecesMap.put(piece, newPiece);
                        System.out.printf("%s by %s in %s added to the collection!%n", piece, composer, key);
                    }
                    break;
                case "Remove":
                    if (piecesMap.containsKey(piece)) {
                        piecesMap.remove(piece);
                        System.out.printf("Successfully removed %s!%n", piece);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
                case "ChangeKey":
                    String newKey = commandData[2];
                    if (piecesMap.containsKey(piece)) {
                        List<String> pieceInfo = piecesMap.get(piece);
                        pieceInfo.set(1, newKey);
                        piecesMap.put(piece, pieceInfo);
                        System.out.printf("Changed the key of %s to %s!%n", piece, newKey);
                    } else {
                        System.out.printf("Invalid operation! %s does not exist in the collection.%n", piece);
                    }
                    break;
            }
            input = scanner.nextLine();
        }
        for (Map.Entry<String, List<String>> pieceInfo : piecesMap.entrySet()) {
            System.out.printf("%s -> Composer: %s, Key: %s%n", pieceInfo.getKey(), pieceInfo.getValue().get(0), pieceInfo.getValue().get(1));
        }
    }
}