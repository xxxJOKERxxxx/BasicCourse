package packet1;

import packet2.AccessLevels;

public class TestAccessOtherPackage extends AccessLevels{
    public static void main(String[] args) {

        AccessLevels obj = new AccessLevels();

        System.out.println(obj.publicVar);

    }

    public void testProtect() {
        System.out.println(protectedVar);
    }


}
