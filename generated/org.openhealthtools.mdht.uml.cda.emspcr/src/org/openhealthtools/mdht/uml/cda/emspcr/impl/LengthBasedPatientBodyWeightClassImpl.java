/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.LengthBasedPatientBodyWeightClass;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.LengthBasedPatientBodyWeightClassOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Length Based Patient Body Weight Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class LengthBasedPatientBodyWeightClassImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements LengthBasedPatientBodyWeightClass {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LengthBasedPatientBodyWeightClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.LENGTH_BASED_PATIENT_BODY_WEIGHT_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassTemplateId(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassMoodCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassCodeP(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassEffectiveTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateLengthBasedPatientBodyWeightClassValue(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return LengthBasedPatientBodyWeightClassOperations.validateLengthBasedPatientBodyWeightClassValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthBasedPatientBodyWeightClass init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public LengthBasedPatientBodyWeightClass init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // LengthBasedPatientBodyWeightClassImpl
