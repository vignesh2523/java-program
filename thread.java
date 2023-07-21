import java.util.Random;

class pk {
    public static void main(String[] args) {
        String[] narutoCharacters = {
            "Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno", "Kakashi Hatake", "Rock Lee", "Neji Hyuga",
            "Tenten", "Might Guy", "Hinata Hyuga", "Shino Aburame", "Kiba Inuzuka", "Akamaru", "Shikamaru Nara",
            "Choji Akimichi", "Ino Yamanaka", "Asuma Sarutobi", "Kurenai Yuhi", "Tsunade", "Jiraiya",
            "Orochimaru", "Kabuto Yakushi", "Itachi Uchiha", "Kisame Hoshigaki", "Deidara", "Sasori",
            "Hidan", "Kakuzu", "Pain", "Konan", "Madara Uchiha", "Obito Uchiha", "Zetsu", "Karin",
            "Suigetsu Hozuki", "Jugo", "Danzo Shimura", "Hashirama Senju", "Tobirama Senju", "Hiruzen Sarutobi",
            "Minato Namikaze", "Kushina Uzumaki", "Iruka Umino", "Kotetsu Hagane", "Izumo Kamizuki",
            "Danzo Shimura", "Hanzo", "Mei Terumi", "Ao", "Kurotsuchi", "Chojuro", "Darui", "Mifune",
            "Shisui Uchiha", "Karin Uzumaki", "Fugaku Uchiha", "Mikoto Uchiha", "Sai", "Yamato", "Killer Bee",
            "Gaara", "Temari", "Kankuro", "Shukaku", "Chiyo", "Sasori's parents", "Konohamaru Sarutobi",
            "Moegi", "Udon", "Kurotsuchi", "Sasuke's father", "Sasuke's mother", "Sasuke's older brother",
            "Sasuke's older brother's wife", "Sasuke's older brother's son", "Sasuke's older brother's daughter",
            "Kabuto's father", "Kabuto's mother", "Naruto's mother's friend"
        };

        Random random = new Random();
        String randomNarutoCharacter = narutoCharacters[random.nextInt(narutoCharacters.length)];

        System.out.println("Random Naruto Character: " + randomNarutoCharacter);
    }
}
