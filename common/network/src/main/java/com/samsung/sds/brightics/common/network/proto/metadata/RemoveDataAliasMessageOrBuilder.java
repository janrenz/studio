// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: metadata.proto

package com.samsung.sds.brightics.common.network.proto.metadata;

public interface RemoveDataAliasMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:com.samsung.sds.brightics.common.network.proto.metadata.RemoveDataAliasMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string user = 1;</code>
   */
  java.lang.String getUser();
  /**
   * <code>string user = 1;</code>
   */
  com.google.protobuf.ByteString
      getUserBytes();

  /**
   * <code>repeated string aliasDataKey = 2;</code>
   */
  java.util.List<java.lang.String>
      getAliasDataKeyList();
  /**
   * <code>repeated string aliasDataKey = 2;</code>
   */
  int getAliasDataKeyCount();
  /**
   * <code>repeated string aliasDataKey = 2;</code>
   */
  java.lang.String getAliasDataKey(int index);
  /**
   * <code>repeated string aliasDataKey = 2;</code>
   */
  com.google.protobuf.ByteString
      getAliasDataKeyBytes(int index);
}