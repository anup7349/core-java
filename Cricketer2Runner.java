class Cricketer2Runner {
    public static void main(String[] args) {
        Cricketer2[] cricketers = new Cricketer2[5];

        Cricketer2 c1 = new Cricketer2();
        c1.setPlayer_name("Virat Kohli");
        c1.setTeam_name("India");
        c1.setTotal_runs(12000);

        Cricketer2 c2 = new Cricketer2();
        c2.setPlayer_name("Steve Smith");
        c2.setTeam_name("Australia");
        c2.setTotal_runs(9500);

        Cricketer2 c3 = new Cricketer2();
        c3.setPlayer_name("Babar Azam");
        c3.setTeam_name("Pakistan");
        c3.setTotal_runs(8000);

        Cricketer2 c4 = new Cricketer2();
        c4.setPlayer_name("Joe Root");
        c4.setTeam_name("England");
        c4.setTotal_runs(11000);

        Cricketer2 c5 = new Cricketer2();
        c5.setPlayer_name("Kane Williamson");
        c5.setTeam_name("New Zealand");
        c5.setTotal_runs(10500);

        for (int i = 0; i < cricketers.length; i++) {
            if (i == 0) {
                cricketers[i] = c1;
            } else if (i == 1) {
                cricketers[i] = c2;
            } else if (i == 2) {
                cricketers[i] = c3;
            } else if (i == 3) {
                cricketers[i] = c4;
            } else if (i == 4) {
                cricketers[i] = c5;
            }
        }

        for (int i = 0; i < cricketers.length; i++) {
            Cricketer2 c = cricketers[i];
            System.out.println(c.getPlayer_name());
            System.out.println(c.getTeam_name());
            System.out.println(c.getTotal_runs());
        }
    }
}
