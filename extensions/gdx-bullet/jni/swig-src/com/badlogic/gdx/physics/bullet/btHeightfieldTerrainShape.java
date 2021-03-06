/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btHeightfieldTerrainShape extends btConcaveShape {
  private long swigCPtr;

  protected btHeightfieldTerrainShape(long cPtr, boolean cMemoryOwn) {
    super(gdxBulletJNI.btHeightfieldTerrainShape_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  public static long getCPtr(btHeightfieldTerrainShape obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gdxBulletJNI.delete_btHeightfieldTerrainShape(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength, SWIGTYPE_p_void heightfieldData, float heightScale, float minHeight, float maxHeight, int upAxis, int heightDataType, boolean flipQuadEdges) {
    this(gdxBulletJNI.new_btHeightfieldTerrainShape__SWIG_0(heightStickWidth, heightStickLength, SWIGTYPE_p_void.getCPtr(heightfieldData), heightScale, minHeight, maxHeight, upAxis, heightDataType, flipQuadEdges), true);
  }

  public btHeightfieldTerrainShape(int heightStickWidth, int heightStickLength, SWIGTYPE_p_void heightfieldData, float maxHeight, int upAxis, boolean useFloatData, boolean flipQuadEdges) {
    this(gdxBulletJNI.new_btHeightfieldTerrainShape__SWIG_1(heightStickWidth, heightStickLength, SWIGTYPE_p_void.getCPtr(heightfieldData), maxHeight, upAxis, useFloatData, flipQuadEdges), true);
  }

  public void setUseDiamondSubdivision(boolean useDiamondSubdivision) {
    gdxBulletJNI.btHeightfieldTerrainShape_setUseDiamondSubdivision__SWIG_0(swigCPtr, this, useDiamondSubdivision);
  }

  public void setUseDiamondSubdivision() {
    gdxBulletJNI.btHeightfieldTerrainShape_setUseDiamondSubdivision__SWIG_1(swigCPtr, this);
  }

}
