package org.example.accessModifier.outsidePackage;

import org.example.accessModifier.withinPackage.Private;
import org.example.accessModifier.withinPackage.ProtectedMain;
import org.example.accessModifier.withinPackage.PublicMain;


public class CheckModifier {
    public static void main(String[] args) {
//        Protected  ---cannot access for outside package
//        private1.a --cannot access
        PublicMain publicMain=new PublicMain();
        publicMain.abc=100;
        Private priv=new Private();
//        priv.abc --cannot access
        ProtectedMain protectedMain=new ProtectedMain();
//        protectedMain.abc --cannot access


    }
}
