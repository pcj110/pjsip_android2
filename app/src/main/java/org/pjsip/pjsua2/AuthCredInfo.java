/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class AuthCredInfo extends PersistentObject {
  private transient long swigCPtr;

  protected AuthCredInfo(long cPtr, boolean cMemoryOwn) {
    super(pjsua2JNI.AuthCredInfo_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(AuthCredInfo obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_AuthCredInfo(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public void setScheme(String value) {
    pjsua2JNI.AuthCredInfo_scheme_set(swigCPtr, this, value);
  }

  public String getScheme() {
    return pjsua2JNI.AuthCredInfo_scheme_get(swigCPtr, this);
  }

  public void setRealm(String value) {
    pjsua2JNI.AuthCredInfo_realm_set(swigCPtr, this, value);
  }

  public String getRealm() {
    return pjsua2JNI.AuthCredInfo_realm_get(swigCPtr, this);
  }

  public void setUsername(String value) {
    pjsua2JNI.AuthCredInfo_username_set(swigCPtr, this, value);
  }

  public String getUsername() {
    return pjsua2JNI.AuthCredInfo_username_get(swigCPtr, this);
  }

  public void setDataType(int value) {
    pjsua2JNI.AuthCredInfo_dataType_set(swigCPtr, this, value);
  }

  public int getDataType() {
    return pjsua2JNI.AuthCredInfo_dataType_get(swigCPtr, this);
  }

  public void setData(String value) {
    pjsua2JNI.AuthCredInfo_data_set(swigCPtr, this, value);
  }

  public String getData() {
    return pjsua2JNI.AuthCredInfo_data_get(swigCPtr, this);
  }

  public void setAkaK(String value) {
    pjsua2JNI.AuthCredInfo_akaK_set(swigCPtr, this, value);
  }

  public String getAkaK() {
    return pjsua2JNI.AuthCredInfo_akaK_get(swigCPtr, this);
  }

  public void setAkaOp(String value) {
    pjsua2JNI.AuthCredInfo_akaOp_set(swigCPtr, this, value);
  }

  public String getAkaOp() {
    return pjsua2JNI.AuthCredInfo_akaOp_get(swigCPtr, this);
  }

  public void setAkaAmf(String value) {
    pjsua2JNI.AuthCredInfo_akaAmf_set(swigCPtr, this, value);
  }

  public String getAkaAmf() {
    return pjsua2JNI.AuthCredInfo_akaAmf_get(swigCPtr, this);
  }

  public AuthCredInfo() {
    this(pjsua2JNI.new_AuthCredInfo__SWIG_0(), true);
  }

  public AuthCredInfo(String scheme, String realm, String user_name, int data_type, String data) {
    this(pjsua2JNI.new_AuthCredInfo__SWIG_1(scheme, realm, user_name, data_type, data), true);
  }

  public void readObject(ContainerNode node) throws Exception {
    pjsua2JNI.AuthCredInfo_readObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

  public void writeObject(ContainerNode node) throws Exception {
    pjsua2JNI.AuthCredInfo_writeObject(swigCPtr, this, ContainerNode.getCPtr(node), node);
  }

}
