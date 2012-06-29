/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.sdtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.OrganizerOperations;

import org.openhealthtools.mdht.uml.cda.sdtm.DataCollection;
import org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics;
import org.openhealthtools.mdht.uml.cda.sdtm.SdtmPackage;
import org.openhealthtools.mdht.uml.cda.sdtm.StudyArm;

import org.openhealthtools.mdht.uml.cda.sdtm.util.SdtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Human Clinical Subject Demographics</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsDataCollection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsStudyArm(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getDataCollection() <em>Get Data Collection</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.sdtm.HumanClinicalSubjectDemographics#getStudyArm() <em>Get Study Arm</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HumanClinicalSubjectDemographicsOperations extends OrganizerOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected HumanClinicalSubjectDemographicsOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.14')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.23.14')
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsTemplateId(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.classCode=vocab::x_ActClassDocumentEntryOrganizer::CLUSTER
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsClassCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1')
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsCodeP(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::ActMood::EVN";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.moodCode=vocab::ActMood::EVN
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsMoodCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(sdtm::Data Collection))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Data Collection</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(sdtm::Data Collection))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsDataCollection(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_DATA_COLLECTION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsDataCollection", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(sdtm::Study Arm))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Study Arm</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.component->one(component : cda::Component4 | not component.act.oclIsUndefined() and component.act.oclIsKindOf(sdtm::Study Arm))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsStudyArm(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_STUDY_ARM,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsStudyArm", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(classCode=vocab::ActClassObservation::OBS)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self..->reject(classCode=vocab::ActClassObservation::OBS)
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined()))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = code.oclAsType(datatypes::CD) in "+
"value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self..->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = code.oclAsType(datatypes::CD) in 
   * value.code = 'TBD' and value.codeSystem = '2.16.840.1.113883.3.26.1.1'))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self..->reject(moodCode=vocab::x_ActMoodDocumentObservation::EVN)
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Subject Age Value</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self..->reject((value->isEmpty() or value->exists(element | element.isNullFlavorUndefined())) implies (value->size() = 1 and value->forAll(element | element.oclIsTypeOf(datatypes::PQ))))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_SUBJECT_AGE_VALUE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationSubjectAgeValue", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.->reject(isDefined('typeCode'))";

  /**
   * The cached OCL invariant for the '{@link #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Human Clinical Subject Demographics Age Association Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.->reject(isDefined('typeCode'))
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateHumanClinicalSubjectDemographicsAgeAssociationTypeCode(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS);
      try
      {
        VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(humanClinicalSubjectDemographics))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             SdtmValidator.DIAGNOSTIC_SOURCE,
             SdtmValidator.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS__HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS_AGE_ASSOCIATION_TYPE_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "HumanClinicalSubjectDemographicsAgeAssociationTypeCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(humanClinicalSubjectDemographics, context) }),
             new Object [] { humanClinicalSubjectDemographics }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getDataCollection(HumanClinicalSubjectDemographics) <em>Get Data Collection</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(HumanClinicalSubjectDemographics)
   * @generated
   * @ordered
   */
  protected static final String GET_DATA_COLLECTION__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)";

  /**
   * The cached OCL query for the '{@link #getDataCollection(HumanClinicalSubjectDemographics) <em>Get Data Collection</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataCollection(HumanClinicalSubjectDemographics)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_DATA_COLLECTION__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Data Collection))->asSequence()->first().oclAsType(sdtm::Data Collection)
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  DataCollection getDataCollection(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics)
  {
    if (GET_DATA_COLLECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(63));
      try
      {
        GET_DATA_COLLECTION__EOCL_QRY = helper.createQuery(GET_DATA_COLLECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_DATA_COLLECTION__EOCL_QRY);
    return (DataCollection) query.evaluate(humanClinicalSubjectDemographics);
  }

  /**
   * The cached OCL expression body for the '{@link #getStudyArm(HumanClinicalSubjectDemographics) <em>Get Study Arm</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyArm(HumanClinicalSubjectDemographics)
   * @generated
   * @ordered
   */
  protected static final String GET_STUDY_ARM__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Arm))->asSequence()->first().oclAsType(sdtm::Study Arm)";

  /**
   * The cached OCL query for the '{@link #getStudyArm(HumanClinicalSubjectDemographics) <em>Get Study Arm</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStudyArm(HumanClinicalSubjectDemographics)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STUDY_ARM__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(sdtm::Study Arm))->asSequence()->first().oclAsType(sdtm::Study Arm)
   * @param humanClinicalSubjectDemographics The receiving '<em><b>Human Clinical Subject Demographics</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  StudyArm getStudyArm(HumanClinicalSubjectDemographics humanClinicalSubjectDemographics)
  {
    if (GET_STUDY_ARM__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS, SdtmPackage.Literals.HUMAN_CLINICAL_SUBJECT_DEMOGRAPHICS.getEAllOperations().get(64));
      try
      {
        GET_STUDY_ARM__EOCL_QRY = helper.createQuery(GET_STUDY_ARM__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STUDY_ARM__EOCL_QRY);
    return (StudyArm) query.evaluate(humanClinicalSubjectDemographics);
  }

} // HumanClinicalSubjectDemographicsOperations