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
package org.openhealthtools.mdht.uml.cda.cdt.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPackage;
import org.openhealthtools.mdht.uml.cda.cdt.CDTPlugin;
import org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection;
import org.openhealthtools.mdht.uml.cda.cdt.util.CDTValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Hospital Discharge Studies Summary Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.cdt.HospitalDischargeStudiesSummarySection#validateHospitalDischargeStudiesSummarySectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HospitalDischargeStudiesSummarySectionOperations extends SectionOperations {
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
	protected HospitalDischargeStudiesSummarySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.16.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionTemplateId(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHospitalDischargeStudiesSummarySectionTemplateId(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TEMPLATE_ID,
						CDTPlugin.INSTANCE.getString(
							"HospitalDischargeStudiesSummarySectionHospitalDischargeStudiesSummarySectionTemplateId"),
						new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '11493-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionCode(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHospitalDischargeStudiesSummarySectionCode(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_CODE,
						CDTPlugin.INSTANCE.getString(
							"HospitalDischargeStudiesSummarySectionHospitalDischargeStudiesSummarySectionCode"),
						new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined() and self.title.getText() = 'HOSPITAL DISCHARGE STUDIES SUMMARY')";

	/**
	 * The cached OCL invariant for the '{@link #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Hospital Discharge Studies Summary Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHospitalDischargeStudiesSummarySectionTitle(HospitalDischargeStudiesSummarySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param hospitalDischargeStudiesSummarySection The receiving '<em><b>Hospital Discharge Studies Summary Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateHospitalDischargeStudiesSummarySectionTitle(
			HospitalDischargeStudiesSummarySection hospitalDischargeStudiesSummarySection, DiagnosticChain diagnostics,
			Map<Object, Object> context) {

		if (VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CDTPackage.Literals.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION);
			try {
				VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				hospitalDischargeStudiesSummarySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CDTValidator.DIAGNOSTIC_SOURCE,
						CDTValidator.HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION__HOSPITAL_DISCHARGE_STUDIES_SUMMARY_SECTION_TITLE,
						CDTPlugin.INSTANCE.getString(
							"HospitalDischargeStudiesSummarySectionHospitalDischargeStudiesSummarySectionTitle"),
						new Object[] { hospitalDischargeStudiesSummarySection }));
			}

			return false;
		}
		return true;
	}

} // HospitalDischargeStudiesSummarySectionOperations
