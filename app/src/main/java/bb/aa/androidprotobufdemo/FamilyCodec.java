package bb.aa.androidprotobufdemo;

import com.google.protobuf.InvalidProtocolBufferException;

class FamilyCodec {

    static byte[] encode(){

        My.Person person = My.Person.newBuilder()
                .setAge(123)
                .setName("asdasdads")
                .build();
        My.Family family = My.Family.newBuilder().addPerson(person).build();

        return family.toByteArray();
    }

    static My.Family decode(byte[] familyBytes){
        My.Family family = null;
        try {
            family = My.Family.parseFrom(familyBytes);
        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }

        return family;
    }
}
