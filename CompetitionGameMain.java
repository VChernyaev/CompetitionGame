package homeTasks.CompetitionGame;

public class CompetitionGameMain {
    public static void main(String[] args) {
        // реализуем соревнования
        // должны быть участники и параметры
        // у участника есть параметры:возможности бега(длина), прыжки(высота),
        // плавание(длина)
        // 3 типа препядствий: беговая дорожка, стена и бассеин
        // 3 типа участников: обычный, кот, читер
        // Обычный участник умеет все в зависимости от параметров
        // Кот не умеет плавать
        // Читер всегда преодолевает препядствия какими бы они не были
        Obstacle[] obstacles = creatObstacles();
        Participian[] participians = createParticipians();
        for (Participian participian : participians) {
            for (Obstacle obstacle : obstacles) {

                boolean result = obstacle.pass(participian);
                if (result) {
                    System.out.println("Участник #" + participian.getName() + " преодолел препядствие");
                } else {
                    System.out.println("Участник #" + participian.getName() + " HE преодолел препядствие");
                }
            }
        }

    }

    private static Obstacle[] creatObstacles() {
        return new Obstacle[] {
                new Road(100),
                new Road(45),
                new SwimmingPool(20),
                new Wall(40)

        };
    }

    private static Participian[] createParticipians() {
        return new Participian[] {
                new StandardParticipant("Igor", 50, 30, 30),
                new Cat("Murzik", 60, 25),
                new Cheater("Cheater")
        };
    }
}
