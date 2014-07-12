/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosis2;
import org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#getConsolHospitalDischargeDiagnosis2() <em>Get Consol Hospital Discharge Diagnosis2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSection2#validateHospitalDischargeDiagnosisSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeDiagnosisSection2Operations extends HospitalDischargeDiagnosisSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HospitalDischargeDiagnosisSection2Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HospitalDischargeDiagnosis2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Hospital Discharge Diagnosis2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosisSection2 The receiving '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2(
			HospitalDischargeDiagnosisSection2 hospitalDischargeDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_HOSPITAL_DISCHARGE_DIAGNOSIS2,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisSectionHospitalDischargeDiagnosis2"),
					new Object[] { hospitalDischargeDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getConsolHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2) <em>Get Consol Hospital Discharge Diagnosis2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HospitalDischargeDiagnosis2))->asSequence()->any(true).oclAsType(consol::HospitalDischargeDiagnosis2)";

	/**
	 * The cached OCL query for the '{@link #getConsolHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2) <em>Get Consol Hospital Discharge Diagnosis2</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConsolHospitalDischargeDiagnosis2(HospitalDischargeDiagnosisSection2)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static HospitalDischargeDiagnosis2 getConsolHospitalDischargeDiagnosis2(
			HospitalDischargeDiagnosisSection2 hospitalDischargeDiagnosisSection2) {
		if (GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2,
				ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2.getEAllOperations().get(63));
			try {
				GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_QRY = helper.createQuery(GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONSOL_HOSPITAL_DISCHARGE_DIAGNOSIS2__EOCL_QRY);
		return (HospitalDischargeDiagnosis2) query.evaluate(hospitalDischargeDiagnosisSection2);
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.24.2')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionTemplateId(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosisSection2 The receiving '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisSectionTemplateId(
			HospitalDischargeDiagnosisSection2 hospitalDischargeDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_TEMPLATE_ID,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisSectionTemplateId"),
					new Object[] { hospitalDischargeDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisSectionCodeP(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionCodeP(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisSectionCodeP(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionCodeP(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosisSection2 The receiving '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisSectionCodeP(
			HospitalDischargeDiagnosisSection2 hospitalDischargeDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE_P,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisSectionCodeP"),
					new Object[] { hospitalDischargeDiagnosisSection2 }));
			}

			if (context != null) {
				// generate a pass token for my dependent constraints to short-circuit or filter results
				@SuppressWarnings("unchecked")
				Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSectionCodeP");
				if (passToken == null) {
					// anticipate a reasonably healthy model
					passToken = new java.util.ArrayList<Object>(3);
					context.put(
						"org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSectionCodeP", passToken);
				}
				passToken.add(hospitalDischargeDiagnosisSection2);
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeDiagnosisSectionCode(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionCode(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '11535-2' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeDiagnosisSectionCode(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Diagnosis Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeDiagnosisSectionCode(HospitalDischargeDiagnosisSection2, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeDiagnosisSection2 The receiving '<em><b>Hospital Discharge Diagnosis Section2</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHospitalDischargeDiagnosisSectionCode(
			HospitalDischargeDiagnosisSection2 hospitalDischargeDiagnosisSection2, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		Object passToken = (context == null)
				? null
				: context.get("org.openhealthtools.mdht.uml.cda.consol.HospitalDischargeDiagnosisSectionCodeP");
		if ((passToken instanceof Collection<?>) &&
				((Collection<?>) passToken).contains(hospitalDischargeDiagnosisSection2)) {
			// I have a free pass to short-circuit
			return true;
		}

		if (VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			hospitalDischargeDiagnosisSection2)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION2__HOSPITAL_DISCHARGE_DIAGNOSIS_SECTION_CODE,
					ConsolPlugin.INSTANCE.getString("HospitalDischargeDiagnosisSectionCode"),
					new Object[] { hospitalDischargeDiagnosisSection2 }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargeDiagnosisSection2Operations