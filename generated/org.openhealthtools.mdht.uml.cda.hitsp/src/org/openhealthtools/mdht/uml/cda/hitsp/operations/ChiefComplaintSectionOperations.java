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
package org.openhealthtools.mdht.uml.cda.hitsp.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection;
import org.openhealthtools.mdht.uml.cda.hitsp.Condition;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPackage;
import org.openhealthtools.mdht.uml.cda.hitsp.HITSPPlugin;
import org.openhealthtools.mdht.uml.cda.hitsp.util.HITSPValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Chief Complaint Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#validateHITSPChiefComplaintSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#validateHITSPChiefComplaintSectionCondition(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Condition</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.hitsp.ChiefComplaintSection#getCondition() <em>Get Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChiefComplaintSectionOperations
		extends org.openhealthtools.mdht.uml.cda.ihe.operations.ChiefComplaintSectionOperations {
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
	protected ChiefComplaintSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.3.88.11.83.105')";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPChiefComplaintSectionTemplateId(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_TEMPLATE_ID,
						HITSPPlugin.INSTANCE.getString("ChiefComplaintSectionHITSPChiefComplaintSectionTemplateId"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHITSPChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(hitsp::Condition))";

	/**
	 * The cached OCL invariant for the '{@link #validateHITSPChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate HITSP Chief Complaint Section Condition</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHITSPChiefComplaintSectionCondition(ChiefComplaintSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param chiefComplaintSection The receiving '<em><b>Chief Complaint Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHITSPChiefComplaintSectionCondition(ChiefComplaintSection chiefComplaintSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(HITSPPackage.Literals.CHIEF_COMPLAINT_SECTION);
			try {
				VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HITSP_CHIEF_COMPLAINT_SECTION_CONDITION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				chiefComplaintSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, HITSPValidator.DIAGNOSTIC_SOURCE,
						HITSPValidator.CHIEF_COMPLAINT_SECTION__HITSP_CHIEF_COMPLAINT_SECTION_CONDITION,
						HITSPPlugin.INSTANCE.getString("ChiefComplaintSectionHITSPChiefComplaintSectionCondition"),
						new Object[] { chiefComplaintSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getCondition(ChiefComplaintSection) <em>Get Condition</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(ChiefComplaintSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONDITION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(hitsp::Condition))->asSequence()->any(true).oclAsType(hitsp::Condition)";

	/**
	 * The cached OCL query for the '{@link #getCondition(ChiefComplaintSection) <em>Get Condition</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition(ChiefComplaintSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONDITION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Condition getCondition(ChiefComplaintSection chiefComplaintSection) {

		if (GET_CONDITION__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				HITSPPackage.Literals.CHIEF_COMPLAINT_SECTION,
				HITSPPackage.Literals.CHIEF_COMPLAINT_SECTION.getEAllOperations().get(61));
			try {
				GET_CONDITION__EOCL_QRY = helper.createQuery(GET_CONDITION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONDITION__EOCL_QRY);
		return (Condition) query.evaluate(chiefComplaintSection);
	}

} // ChiefComplaintSectionOperations
