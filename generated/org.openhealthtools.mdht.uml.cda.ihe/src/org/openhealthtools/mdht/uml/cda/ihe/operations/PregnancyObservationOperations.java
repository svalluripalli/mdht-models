/*******************************************************************************
 * Copyright (c) 2009, 2012 David A Carlson and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     David A Carlson (XMLmodeling.com) - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ihe.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPackage;
import org.openhealthtools.mdht.uml.cda.ihe.IHEPlugin;
import org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation;
import org.openhealthtools.mdht.uml.cda.ihe.util.IHEValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Pregnancy Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationInterpretationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Interpretation Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationMethodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Method Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationRepeatNumber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Repeat Number</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationTargetSiteCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Target Site Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validatePregnancyObservationValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ihe.PregnancyObservation#validateSimpleObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Simple Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PregnancyObservationOperations extends SimpleObservationOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PregnancyObservationOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_CODE,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationCode"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationInterpretationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Interpretation Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationInterpretationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.interpretationCode->isEmpty() or self.interpretationCode->exists(element | element.isNullFlavorUndefined())) implies (not self.interpretationCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationInterpretationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Interpretation Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationInterpretationCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationInterpretationCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_INTERPRETATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_INTERPRETATION_CODE,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationInterpretationCode"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationMethodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Method Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationMethodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.methodCode->isEmpty() or self.methodCode->exists(element | element.isNullFlavorUndefined())) implies (not self.methodCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationMethodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Method Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationMethodCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationMethodCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_METHOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_METHOD_CODE,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationMethodCode"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationRepeatNumber(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Repeat Number</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationRepeatNumber(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.repeatNumber.oclIsUndefined() or self.repeatNumber.isNullFlavorUndefined()) implies (not self.repeatNumber.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationRepeatNumber(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Repeat Number</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationRepeatNumber(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationRepeatNumber(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_REPEAT_NUMBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_REPEAT_NUMBER,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationRepeatNumber"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationTargetSiteCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Target Site Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationTargetSiteCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.targetSiteCode->isEmpty() or self.targetSiteCode->exists(element | element.isNullFlavorUndefined())) implies (not self.targetSiteCode->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationTargetSiteCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Target Site Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationTargetSiteCode(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationTargetSiteCode(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_TARGET_SITE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_TARGET_SITE_CODE,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationTargetSiteCode"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.value->isEmpty() or self.value->exists(element | element.isNullFlavorUndefined())) implies (not self.value->isEmpty())";

	/**
	 * The cached OCL invariant for the '{@link #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Pregnancy Observation Value</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validatePregnancyObservationValue(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validatePregnancyObservationValue(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_PREGNANCY_OBSERVATION_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__PREGNANCY_OBSERVATION_VALUE,
						IHEPlugin.INSTANCE.getString("PregnancyObservationPregnancyObservationValue"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateSimpleObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Simple Observation Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSimpleObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '1.3.6.1.4.1.19376.1.5.3.1.4.13.5')";

	/**
	 * The cached OCL invariant for the '{@link #validateSimpleObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Simple Observation Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateSimpleObservationTemplateId(PregnancyObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param pregnancyObservation The receiving '<em><b>Pregnancy Observation</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateSimpleObservationTemplateId(PregnancyObservation pregnancyObservation,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(IHEPackage.Literals.PREGNANCY_OBSERVATION);
			try {
				VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_SIMPLE_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				pregnancyObservation)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, IHEValidator.DIAGNOSTIC_SOURCE,
						IHEValidator.PREGNANCY_OBSERVATION__SIMPLE_OBSERVATION_TEMPLATE_ID,
						IHEPlugin.INSTANCE.getString("PregnancyObservationSimpleObservationTemplateId"),
						new Object[] { pregnancyObservation }));
			}

			return false;
		}
		return true;
	}

} // PregnancyObservationOperations
