package com.facebook.beringei.thriftclient;

/**

 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.EncodingUtils;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;


import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;

import javax.annotation.Generated;


@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2017-04-22")
public class GetLastUpdateTimesResult implements org.apache.thrift.TBase<GetLastUpdateTimesResult, GetLastUpdateTimesResult._Fields>, java.io.Serializable, Cloneable, Comparable<GetLastUpdateTimesResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("GetLastUpdateTimesResult");

  private static final org.apache.thrift.protocol.TField KEYS_FIELD_DESC = new org.apache.thrift.protocol.TField("keys", org.apache.thrift.protocol.TType.LIST, (short)1);
  private static final org.apache.thrift.protocol.TField MORE_RESULTS_FIELD_DESC = new org.apache.thrift.protocol.TField("moreResults", org.apache.thrift.protocol.TType.BOOL, (short)2);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new GetLastUpdateTimesResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new GetLastUpdateTimesResultTupleSchemeFactory());
  }

  public List<KeyUpdateTime> keys; // required
  public boolean moreResults; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    KEYS((short)1, "keys"),
    MORE_RESULTS((short)2, "moreResults");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // KEYS
          return KEYS;
        case 2: // MORE_RESULTS
          return MORE_RESULTS;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __MORERESULTS_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.KEYS, new org.apache.thrift.meta_data.FieldMetaData("keys", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, KeyUpdateTime.class))));
    tmpMap.put(_Fields.MORE_RESULTS, new org.apache.thrift.meta_data.FieldMetaData("moreResults", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(GetLastUpdateTimesResult.class, metaDataMap);
  }

  public GetLastUpdateTimesResult() {
  }

  public GetLastUpdateTimesResult(
    List<KeyUpdateTime> keys,
    boolean moreResults)
  {
    this();
    this.keys = keys;
    this.moreResults = moreResults;
    setMoreResultsIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public GetLastUpdateTimesResult(GetLastUpdateTimesResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetKeys()) {
      List<KeyUpdateTime> __this__keys = new ArrayList<KeyUpdateTime>(other.keys.size());
      for (KeyUpdateTime other_element : other.keys) {
        __this__keys.add(new KeyUpdateTime(other_element));
      }
      this.keys = __this__keys;
    }
    this.moreResults = other.moreResults;
  }

  public GetLastUpdateTimesResult deepCopy() {
    return new GetLastUpdateTimesResult(this);
  }

  @Override
  public void clear() {
    this.keys = null;
    setMoreResultsIsSet(false);
    this.moreResults = false;
  }

  public int getKeysSize() {
    return (this.keys == null) ? 0 : this.keys.size();
  }

  public java.util.Iterator<KeyUpdateTime> getKeysIterator() {
    return (this.keys == null) ? null : this.keys.iterator();
  }

  public void addToKeys(KeyUpdateTime elem) {
    if (this.keys == null) {
      this.keys = new ArrayList<KeyUpdateTime>();
    }
    this.keys.add(elem);
  }

  public List<KeyUpdateTime> getKeys() {
    return this.keys;
  }

  public GetLastUpdateTimesResult setKeys(List<KeyUpdateTime> keys) {
    this.keys = keys;
    return this;
  }

  public void unsetKeys() {
    this.keys = null;
  }

  /** Returns true if field keys is set (has been assigned a value) and false otherwise */
  public boolean isSetKeys() {
    return this.keys != null;
  }

  public void setKeysIsSet(boolean value) {
    if (!value) {
      this.keys = null;
    }
  }

  public boolean isMoreResults() {
    return this.moreResults;
  }

  public GetLastUpdateTimesResult setMoreResults(boolean moreResults) {
    this.moreResults = moreResults;
    setMoreResultsIsSet(true);
    return this;
  }

  public void unsetMoreResults() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __MORERESULTS_ISSET_ID);
  }

  /** Returns true if field moreResults is set (has been assigned a value) and false otherwise */
  public boolean isSetMoreResults() {
    return EncodingUtils.testBit(__isset_bitfield, __MORERESULTS_ISSET_ID);
  }

  public void setMoreResultsIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __MORERESULTS_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case KEYS:
      if (value == null) {
        unsetKeys();
      } else {
        setKeys((List<KeyUpdateTime>)value);
      }
      break;

    case MORE_RESULTS:
      if (value == null) {
        unsetMoreResults();
      } else {
        setMoreResults((Boolean)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case KEYS:
      return getKeys();

    case MORE_RESULTS:
      return isMoreResults();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case KEYS:
      return isSetKeys();
    case MORE_RESULTS:
      return isSetMoreResults();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof GetLastUpdateTimesResult)
      return this.equals((GetLastUpdateTimesResult)that);
    return false;
  }

  public boolean equals(GetLastUpdateTimesResult that) {
    if (that == null)
      return false;

    boolean this_present_keys = true && this.isSetKeys();
    boolean that_present_keys = true && that.isSetKeys();
    if (this_present_keys || that_present_keys) {
      if (!(this_present_keys && that_present_keys))
        return false;
      if (!this.keys.equals(that.keys))
        return false;
    }

    boolean this_present_moreResults = true;
    boolean that_present_moreResults = true;
    if (this_present_moreResults || that_present_moreResults) {
      if (!(this_present_moreResults && that_present_moreResults))
        return false;
      if (this.moreResults != that.moreResults)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_keys = true && (isSetKeys());
    list.add(present_keys);
    if (present_keys)
      list.add(keys);

    boolean present_moreResults = true;
    list.add(present_moreResults);
    if (present_moreResults)
      list.add(moreResults);

    return list.hashCode();
  }

  @Override
  public int compareTo(GetLastUpdateTimesResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetKeys()).compareTo(other.isSetKeys());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeys()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keys, other.keys);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetMoreResults()).compareTo(other.isSetMoreResults());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetMoreResults()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.moreResults, other.moreResults);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("GetLastUpdateTimesResult(");
    boolean first = true;

    sb.append("keys:");
    if (this.keys == null) {
      sb.append("null");
    } else {
      sb.append(this.keys);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("moreResults:");
    sb.append(this.moreResults);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class GetLastUpdateTimesResultStandardSchemeFactory implements SchemeFactory {
    public GetLastUpdateTimesResultStandardScheme getScheme() {
      return new GetLastUpdateTimesResultStandardScheme();
    }
  }

  private static class GetLastUpdateTimesResultStandardScheme extends StandardScheme<GetLastUpdateTimesResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, GetLastUpdateTimesResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // KEYS
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list88 = iprot.readListBegin();
                struct.keys = new ArrayList<KeyUpdateTime>(_list88.size);
                KeyUpdateTime _elem89;
                for (int _i90 = 0; _i90 < _list88.size; ++_i90)
                {
                  _elem89 = new KeyUpdateTime();
                  _elem89.read(iprot);
                  struct.keys.add(_elem89);
                }
                iprot.readListEnd();
              }
              struct.setKeysIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // MORE_RESULTS
            if (schemeField.type == org.apache.thrift.protocol.TType.BOOL) {
              struct.moreResults = iprot.readBool();
              struct.setMoreResultsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, GetLastUpdateTimesResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.keys != null) {
        oprot.writeFieldBegin(KEYS_FIELD_DESC);
        {
          oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.keys.size()));
          for (KeyUpdateTime _iter91 : struct.keys)
          {
            _iter91.write(oprot);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
      oprot.writeFieldBegin(MORE_RESULTS_FIELD_DESC);
      oprot.writeBool(struct.moreResults);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class GetLastUpdateTimesResultTupleSchemeFactory implements SchemeFactory {
    public GetLastUpdateTimesResultTupleScheme getScheme() {
      return new GetLastUpdateTimesResultTupleScheme();
    }
  }

  private static class GetLastUpdateTimesResultTupleScheme extends TupleScheme<GetLastUpdateTimesResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, GetLastUpdateTimesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetKeys()) {
        optionals.set(0);
      }
      if (struct.isSetMoreResults()) {
        optionals.set(1);
      }
      oprot.writeBitSet(optionals, 2);
      if (struct.isSetKeys()) {
        {
          oprot.writeI32(struct.keys.size());
          for (KeyUpdateTime _iter92 : struct.keys)
          {
            _iter92.write(oprot);
          }
        }
      }
      if (struct.isSetMoreResults()) {
        oprot.writeBool(struct.moreResults);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, GetLastUpdateTimesResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(2);
      if (incoming.get(0)) {
        {
          org.apache.thrift.protocol.TList _list93 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.keys = new ArrayList<KeyUpdateTime>(_list93.size);
          KeyUpdateTime _elem94;
          for (int _i95 = 0; _i95 < _list93.size; ++_i95)
          {
            _elem94 = new KeyUpdateTime();
            _elem94.read(iprot);
            struct.keys.add(_elem94);
          }
        }
        struct.setKeysIsSet(true);
      }
      if (incoming.get(1)) {
        struct.moreResults = iprot.readBool();
        struct.setMoreResultsIsSet(true);
      }
    }
  }

}
