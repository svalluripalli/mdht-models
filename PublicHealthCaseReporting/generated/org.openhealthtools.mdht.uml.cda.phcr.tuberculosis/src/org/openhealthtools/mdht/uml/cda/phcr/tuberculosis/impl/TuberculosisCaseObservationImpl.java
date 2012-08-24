/*******************************************************************************
 * Copyright (c) 2012, Public Health Data Standards Consortium (PHDSC)
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     PHDSC - initial API and implementation
 *******************************************************************************/
package org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.phcr.impl.CaseObservationImpl;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisCaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisPackage;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSignsAndSymptomsObservation;

import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.TuberculosisSiteOfTBDiseaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.tuberculosis.operations.TuberculosisCaseObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TuberculosisCaseObservationImpl extends CaseObservationImpl implements TuberculosisCaseObservation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TuberculosisCaseObservationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TuberculosisPackage.Literals.TUBERCULOSIS_CASE_OBSERVATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationTuberculosisSignsAndSymptomsObservation(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return TuberculosisCaseObservationOperations.validateTuberculosisCaseObservationTuberculosisSiteOfTBDiseaseObservation(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TuberculosisSignsAndSymptomsObservation> getTuberculosisSignsAndSymptomsObservations() {
		return TuberculosisCaseObservationOperations.getTuberculosisSignsAndSymptomsObservations(this);
	}

	/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EList<TuberculosisSiteOfTBDiseaseObservation> getTuberculosisSiteOfTBDiseaseObservations()
  {
		return TuberculosisCaseObservationOperations.getTuberculosisSiteOfTBDiseaseObservations(this);
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateProblemObservationTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseObservationOperations.validateProblemObservationTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean validateCaseObservationValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return TuberculosisCaseObservationOperations.validateCaseObservationValue(this, diagnostics, context);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public TuberculosisCaseObservation init() {
    	CDAUtil.init(this);
    	return this;
	}
} //TuberculosisCaseObservationImpl