package address;

import org.bitcoinj.core.Address;
import org.bitcoinj.core.ECKey;
import org.bitcoinj.core.NetworkParameters;
import org.bitcoinj.params.MainNetParams;
import org.bitcoinj.script.Script;


import java.util.Arrays;

public class LegacyAddress {
    public static void createLegacyAddr(){
        NetworkParameters params = MainNetParams.get();
        ECKey key = new ECKey();
        System.out.println("私钥："+key.getPrivateKeyAsHex());
        System.out.println("公钥："+key.getPublicKeyAsHex());
        System.out.println("地址："+ Address.fromKey(params,key, Script.ScriptType.P2PKH));
    }

    public static void main(String[] args) {
        createLegacyAddr();
    }
}
