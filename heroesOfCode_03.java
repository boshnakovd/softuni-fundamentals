import java.util.*;

import static java.lang.Integer.parseInt;

public class heroesOfCode_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = parseInt(scanner.nextLine());
        Map<String, List<Integer>> data = new LinkedHashMap<>();
        for (int i = 0; i < n; i++) {
            String [] heroesToken = scanner.nextLine().split(" ");
            String hero = heroesToken[0];
            int HP = parseInt(heroesToken[1]);
            int MP = parseInt(heroesToken[2]);
            data.putIfAbsent(hero, new ArrayList<>());
            data.get(hero).add(0, HP);
            data.get(hero).add(1, MP);
        }
        String commandLine = scanner.nextLine();
        while (!commandLine.equals("End")){
            String [] tokens = commandLine.split(" - ");
            String command = tokens[0];
            String hero = tokens[1];
            int HP = data.get(hero).get(0);
            int MP = data.get(hero).get(1);
            switch (command){
                case "CastSpell": //CastSpell – {hero name} – {MP needed} – {spell name}
                   int mana = parseInt(tokens[2]);
                   String spellName = tokens[3];
                    int currentMana = MP - mana;
                   if(currentMana >= 0){
                       System.out.printf("%s has successfully cast %s and now has %d MP!%n", hero, spellName, currentMana);
                       data.get(hero).set(1, currentMana);
                   } else {
                       System.out.printf("%s does not have enough MP to cast %s!%n", hero, spellName);
                   }
                    break;
                case "TakeDamage": //TakeDamage – {hero name} – {damage} – {attacker}
                    int takenDmg = parseInt(tokens[2]);
                    String attacker = tokens[3];
                        int leftHP = HP - takenDmg;
                    if(leftHP > 0){
                        System.out.printf("%s was hit for %d HP by %s and now has %d HP left!%n", hero, takenDmg,
                                attacker, leftHP);
                        data.get(hero).set(0, leftHP);
                    } else {
                        System.out.printf("%s has been killed by %s!%n", hero, attacker);
                        data.remove(hero);
                    }
                    break;
                case "Recharge": //Recharge – {hero name} – {amount}
                    int rechargeMana = parseInt(tokens[2]);
                    int totalMana = MP + rechargeMana;
                    int diffMana = 0;
                    if (totalMana > 200) {
                        diffMana = 200 - MP;
                        totalMana = 200;
                    } else {
                        diffMana = rechargeMana;
                    }
                    data.get(hero).set(1, totalMana);
                    System.out.printf("%s recharged for %d MP!%n", hero, diffMana);
                    break;
                case "Heal": //Heal – {hero name} – {amount}
                    int rechargeHP = parseInt(tokens[2]);
                    int totalHP = HP + rechargeHP;
                    int diffHP = 0;
                    if(totalHP > 100){
                        diffHP = 100 - HP;
                        totalHP = 100;
                    } else {
                        diffHP = rechargeHP;
                    }
                    data.get(hero).set(0, totalHP);
                    System.out.printf("%s healed for %d HP!%n", hero, diffHP);
                    break;
                default:
                    System.out.println("Wrong Command!");
                    break;
            }
            commandLine = scanner.nextLine();
        }
        for(Map.Entry<String, List<Integer>> entry : data.entrySet()){
            String hero = entry.getKey();
            int HP = entry.getValue().get(0);
            int MP = entry.getValue().get(1);
            System.out.printf("%s%n  HP: %d%n  MP: %d%n", hero, HP, MP);
        }
    }
}
