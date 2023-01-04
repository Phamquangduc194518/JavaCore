public class Main {
    public static void main(String[] args) {

        Dogs dog1 = new Dogs(" 4 chan", " VN", " mau den", " BABY", 12, " hay an", " hay sua", " tai cup") {
            @Override
            public void call() {
                System.out.println("keu : gau gau");
            }

            @Override
            public void lock() {
                System.out.println("nhin xa : 300m");
            }
        };
        dog1.scent =7;
        dog1.getInfoDog();
        dog1.lock();
        System.out.println("----------------------------------------------------");

        Dogs dog2 = new Dogs(" 4 chan", " TQ", " mau trang", " kiki", 10, " hay ngu", " o ban", " tai venh") {
            @Override
            public void call() {
                System.out.println(" keu : gu` gu`");
            }

            @Override
            public void lock() {
                System.out.println("nhin xa : 200m");
            }
        };
        dog2.scent = 1;
        dog2.getInfoDog();
        dog2.call();
        dog2.lock();
        System.out.println("----------------------------------------------------");
        dog1.compareto(dog2);
        System.out.println("----------------------------------------------------");
        Cats cats1 = new Cats(" 4 chan", " VN", " mau den", " BABY", 12, " hay an", " hay an") {
            @Override
            public int hunter() {
                return 6;
            }
        };
        cats1.seetoDark  ="30m";
        Cats cats2 = new Cats(" 3 chan", " HK", " mau vang", " BY", 8, " hay di choi ", " toc vang") {
            @Override
            public int hunter() {
                return 8;
            }
        };
        cats2.seetoDark = " 22m";
        cats1.hunterMaus(cats2);

    }
}