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
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.EncountersActivites;
import org.openhealthtools.mdht.uml.cda.consol.EncountersSection;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Encounters Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEntriesOptionalCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEncountersActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#getnullEncountersActivities() <em>Getnull Encounters Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.EncountersSection#validateEncountersSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EncountersSectionOperations extends EncountersSectionEntriesOptionalOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EncountersSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in ("
			+ "value.code = '46240-8' and value.codeSystem = '2.16.840.1.113883.6.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalCode(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and 
	 * let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in (
	 * value.code = '46240-8' and value.codeSystem = '2.16.840.1.113883.6.1'))
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEntriesOptionalCode(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_CODE,
					ConsolPlugin.INSTANCE.getString("EncountersSectionEntriesOptionalCode"),
					new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionTitle(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionTitle(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TITLE,
					ConsolPlugin.INSTANCE.getString("EncountersSectionTitle"), new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionText(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.text.oclIsUndefined()
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionText(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_TEXT,
					ConsolPlugin.INSTANCE.getString("EncountersSectionText"), new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncountersActivites))";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Encounters Activity</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEncountersActivity(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(consol::EncountersActivites))
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEncountersActivity(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENCOUNTERS_ACTIVITY,
					ConsolPlugin.INSTANCE.getString("EncountersSectionEncountersActivity"),
					new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getnullEncountersActivities(EncountersSection) <em>Getnull Encounters Activities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullEncountersActivities(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncountersActivites)).oclAsType(consol::EncountersActivites)";

	/**
	 * The cached OCL query for the '{@link #getnullEncountersActivities(EncountersSection) <em>Getnull Encounters Activities</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getnullEncountersActivities(EncountersSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(consol::EncountersActivites)).oclAsType(consol::EncountersActivites)
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static EList<EncountersActivites> getnullEncountersActivities(EncountersSection encountersSection) {
		if (GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.ENCOUNTERS_SECTION,
				ConsolPackage.Literals.ENCOUNTERS_SECTION.getEAllOperations().get(60));
			try {
				GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_QRY = helper.createQuery(GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETNULL_ENCOUNTERS_ACTIVITIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<EncountersActivites> result = (Collection<EncountersActivites>) query.evaluate(encountersSection);
		return new BasicEList.UnmodifiableEList<EncountersActivites>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22')";

	/**
	 * The cached OCL invariant for the '{@link #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Encounters Section Entries Optional Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateEncountersSectionEntriesOptionalTemplateId(EncountersSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.22')
	 * @param encountersSection The receiving '<em><b>Encounters Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	public static boolean validateEncountersSectionEntriesOptionalTemplateId(EncountersSection encountersSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(ConsolPackage.Literals.ENCOUNTERS_SECTION);
			try {
				VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			encountersSection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					ConsolValidator.DIAGNOSTIC_SOURCE,
					ConsolValidator.ENCOUNTERS_SECTION__ENCOUNTERS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"EncountersSectionEntriesOptionalTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(encountersSection, context) }),
					new Object[] { encountersSection }));
			}
			return false;
		}
		return true;
	}

} // EncountersSectionOperations