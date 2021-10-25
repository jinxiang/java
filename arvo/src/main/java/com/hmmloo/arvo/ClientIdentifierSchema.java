package com.hmmloo.arvo;

import org.apache.avro.Schema;
import org.apache.avro.SchemaBuilder;

public class ClientIdentifierSchema {
  public static void main(String[] args) {
    //
    Schema clientIdentifier =
        SchemaBuilder.record("clientIdentifier")
            .namespace("com.hmmloo.arvo")
            .fields()
            .requiredString("hostName")
            .requiredString("ipAddress").endRecord();
    System.out.println(clientIdentifier.toString());
  }
}
