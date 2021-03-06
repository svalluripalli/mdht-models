/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation;

import org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.util.ChlamydiatrachomatisValidator;

import org.openhealthtools.mdht.uml.cda.phcr.operations.ResultObservationOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Result Observation</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.phcr.chlamydiatrachomatis.ChlamydiatrachomatisResultObservation#validateResultObservationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ChlamydiatrachomatisResultObservationOperations extends ResultObservationOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ChlamydiatrachomatisResultObservationOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Result Observation Code</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Chlamydiatrachomatis Result Observation Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param chlamydiatrachomatisResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateChlamydiatrachomatisResultObservationCode(ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION);
      try
      {
        VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateChlamydiatrachomatisResultObservationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisResultObservation, context) }),
             new Object [] { chlamydiatrachomatisResultObservation }));
      }
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.120')";

  /**
   * The cached OCL invariant for the '{@link #validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Result Observation Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.15.3.120')
   * @param chlamydiatrachomatisResultObservation The receiving '<em><b>Result Observation</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateResultObservationTemplateId(ChlamydiatrachomatisResultObservation chlamydiatrachomatisResultObservation, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(ChlamydiatrachomatisPackage.Literals.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION);
      try
      {
        VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_RESULT_OBSERVATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(chlamydiatrachomatisResultObservation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             ChlamydiatrachomatisValidator.DIAGNOSTIC_SOURCE,
             ChlamydiatrachomatisValidator.CHLAMYDIATRACHOMATIS_RESULT_OBSERVATION__RESULT_OBSERVATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "validateResultObservationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(chlamydiatrachomatisResultObservation, context) }),
             new Object [] { chlamydiatrachomatisResultObservation }));
      }
      return false;
    }
    return true;
  }

} // ChlamydiatrachomatisResultObservationOperations