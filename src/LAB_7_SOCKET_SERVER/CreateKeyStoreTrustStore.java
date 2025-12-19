package LAB_7_SOCKET_SERVER;

public class CreateKeyStoreTrustStore {


    // to create a server.keyStore
    // 1. in cmd , run code out of Src file
    //  keytool -genkeypair -alias serverkey -keyalg RSA -keysize 2048 -keystore server.keystore -validity 365
    // - verify keystore - keytool -list -keystore server.keystore



    // to crete trust store
    // 1. first create
    // first create a Server.cer
    // - keytool -exportcert -alias serverkey -keystore server.keystore -file server.cer
    // then create a trustStore in cmd
    // -keytool -importcert -alias servercert -file server.cer -keystore client.truststore
    //- verify by using this code -keytool -list -keystore client.truststore

}
