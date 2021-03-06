/*******************************************************************************
 * Copyright (c) 2009, 2012 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.ccd.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPackage;
import org.openhealthtools.mdht.uml.cda.ccd.CCDPlugin;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection;
import org.openhealthtools.mdht.uml.cda.ccd.util.CCDValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Vital Signs Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#validateVitalSignsSectionVitalSignsOrganizer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.ccd.VitalSignsSection#getVitalSignsOrganizers() <em>Get Vital Signs Organizers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VitalSignsSectionOperations extends SectionOperations {
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
	protected VitalSignsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.1.16')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTemplateId(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignsSectionTemplateId(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEMPLATE_ID,
						CCDPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsSectionTemplateId"),
						new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '8716-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionCode(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignsSectionCode(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_VITAL_SIGNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_CODE,
						CCDPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsSectionCode"),
						new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionTitle(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignsSectionTitle(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_VITAL_SIGNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TITLE,
						CCDPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsSectionTitle"),
						new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionText(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignsSectionText(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(VALIDATE_VITAL_SIGNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
			vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_TEXT,
						CCDPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsSectionText"),
						new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.organizer.oclIsUndefined() and entry.organizer.oclIsKindOf(ccd::VitalSignsOrganizer))";

	/**
	 * The cached OCL invariant for the '{@link #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Vital Signs Section Vital Signs Organizer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static ThreadLocal<Constraint> VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param vitalSignsSection The receiving '<em><b>Vital Signs Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateVitalSignsSectionVitalSignsOrganizer(VitalSignsSection vitalSignsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(CCDPackage.Literals.VITAL_SIGNS_SECTION);
			try {
				VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				vitalSignsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, CCDValidator.DIAGNOSTIC_SOURCE,
						CCDValidator.VITAL_SIGNS_SECTION__VITAL_SIGNS_SECTION_VITAL_SIGNS_ORGANIZER,
						CCDPlugin.INSTANCE.getString("VitalSignsSectionVitalSignsSectionVitalSignsOrganizer"),
						new Object[] { vitalSignsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getVitalSignsOrganizers(VitalSignsSection) <em>Get Vital Signs Organizers</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizers(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_VITAL_SIGNS_ORGANIZERS__EOCL_EXP = "self.getOrganizers()->select(organizer : cda::Organizer | not organizer.oclIsUndefined() and organizer.oclIsKindOf(ccd::VitalSignsOrganizer)).oclAsType(ccd::VitalSignsOrganizer)";

	/**
	 * The cached OCL query for the '{@link #getVitalSignsOrganizers(VitalSignsSection) <em>Get Vital Signs Organizers</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitalSignsOrganizers(VitalSignsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_VITAL_SIGNS_ORGANIZERS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EList<VitalSignsOrganizer> getVitalSignsOrganizers(VitalSignsSection vitalSignsSection) {

		if (GET_VITAL_SIGNS_ORGANIZERS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				CCDPackage.Literals.VITAL_SIGNS_SECTION,
				CCDPackage.Literals.VITAL_SIGNS_SECTION.getEAllOperations().get(60));
			try {
				GET_VITAL_SIGNS_ORGANIZERS__EOCL_QRY = helper.createQuery(GET_VITAL_SIGNS_ORGANIZERS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_VITAL_SIGNS_ORGANIZERS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<VitalSignsOrganizer> result = (Collection<VitalSignsOrganizer>) query.evaluate(vitalSignsSection);
		return new BasicEList.UnmodifiableEList<VitalSignsOrganizer>(result.size(), result.toArray());
	}

} // VitalSignsSectionOperations
