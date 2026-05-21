package Task11;

public class Test {

    static String getAdultNameById(UserRepository repo, int id) {
        return repo.findById(id)
                .filter(u -> u.age() >= 18)
                .map(User::name)
                .map(String::toUpperCase)
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
    }

    public static void main(String[] args) {
        UserRepository repo = new UserRepository();
        System.out.println("id = 1 >>> " + getAdultNameById(repo, 1));
        System.out.println("id = 3 >>> " + getAdultNameById(repo, 3));
        try {
            System.out.println("id = 2 >>> " + getAdultNameById(repo, 2));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
        try {
            System.out.println("id = 99 >>> " + getAdultNameById(repo, 99));
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }
}
