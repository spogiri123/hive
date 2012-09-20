/**
 * Autogenerated by Thrift Compiler (0.7.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 */
package org.apache.hive.service.cli.thrift;

import org.apache.commons.lang.builder.HashCodeBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Constants {

  public static final Set<TType> PRIMITIVE_TYPES = new HashSet<TType>();
  static {
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.BOOLEAN_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.TINYINT_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.SMALLINT_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.INT_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.BIGINT_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.FLOAT_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.DOUBLE_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.STRING_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.TIMESTAMP_TYPE);
    PRIMITIVE_TYPES.add(org.apache.hive.service.cli.thrift.TType.BINARY_TYPE);
  }

  public static final Set<TType> COMPLEX_TYPES = new HashSet<TType>();
  static {
    COMPLEX_TYPES.add(org.apache.hive.service.cli.thrift.TType.ARRAY_TYPE);
    COMPLEX_TYPES.add(org.apache.hive.service.cli.thrift.TType.MAP_TYPE);
    COMPLEX_TYPES.add(org.apache.hive.service.cli.thrift.TType.STRUCT_TYPE);
    COMPLEX_TYPES.add(org.apache.hive.service.cli.thrift.TType.UNION_TYPE);
    COMPLEX_TYPES.add(org.apache.hive.service.cli.thrift.TType.USER_DEFINED_TYPE);
  }

  public static final Set<TType> COLLECTION_TYPES = new HashSet<TType>();
  static {
    COLLECTION_TYPES.add(org.apache.hive.service.cli.thrift.TType.ARRAY_TYPE);
    COLLECTION_TYPES.add(org.apache.hive.service.cli.thrift.TType.MAP_TYPE);
  }

  public static final Map<TType,String> TYPE_NAMES = new HashMap<TType,String>();
  static {
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.BOOLEAN_TYPE, "BOOLEAN");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.TINYINT_TYPE, "TINYINT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.SMALLINT_TYPE, "SMALLINT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.INT_TYPE, "INT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.BIGINT_TYPE, "BIGINT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.FLOAT_TYPE, "FLOAT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.DOUBLE_TYPE, "DOUBLE");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.STRING_TYPE, "STRING");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.TIMESTAMP_TYPE, "TIMESTAMP");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.BINARY_TYPE, "BINARY");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.ARRAY_TYPE, "ARRAY");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.MAP_TYPE, "MAP");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.STRUCT_TYPE, "STRUCT");
    TYPE_NAMES.put(org.apache.hive.service.cli.thrift.TType.UNION_TYPE, "UNIONTYPE");
  }

}
