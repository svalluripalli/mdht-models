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
package org.openhealthtools.mdht.uml.cda.phcr.tularemia.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Organizer;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultObservation;
import org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer;
import org.openhealthtools.mdht.uml.cda.ccd.ResultsSection;
import org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection;

import org.openhealthtools.mdht.uml.cda.phcr.CaseObservation;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection;
import org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection;
import org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport;
import org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation;
import org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration;
import org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.phcr.tularemia.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPackage
 * @generated
 */
public class TularemiaAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TularemiaPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TularemiaAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TularemiaPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TularemiaSwitch<Adapter> modelSwitch =
		new TularemiaSwitch<Adapter>() {
			@Override
			public Adapter caseTularemiaCaseReport(TularemiaCaseReport object) {
				return createTularemiaCaseReportAdapter();
			}
			@Override
			public Adapter caseTularemiaPHCRSocialHistorySection(TularemiaPHCRSocialHistorySection object) {
				return createTularemiaPHCRSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseTularemiaPossibleExposureLocationAndTypeAct(TularemiaPossibleExposureLocationAndTypeAct object) {
				return createTularemiaPossibleExposureLocationAndTypeActAdapter();
			}
			@Override
			public Adapter caseTularemiaPHCRClinicalInformationSection(TularemiaPHCRClinicalInformationSection object) {
				return createTularemiaPHCRClinicalInformationSectionAdapter();
			}
			@Override
			public Adapter caseTularemiaCaseObservation(TularemiaCaseObservation object) {
				return createTularemiaCaseObservationAdapter();
			}
			@Override
			public Adapter caseTularemiaSignsAndSymptomsObservation(TularemiaSignsAndSymptomsObservation object) {
				return createTularemiaSignsAndSymptomsObservationAdapter();
			}
			@Override
			public Adapter caseLocationOfLesionObservation(LocationOfLesionObservation object) {
				return createLocationOfLesionObservationAdapter();
			}
			@Override
			public Adapter caseTularemiaPHCRTreatmentInformationSection(TularemiaPHCRTreatmentInformationSection object) {
				return createTularemiaPHCRTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseTularemiaTherapeuticRegimenAct(TularemiaTherapeuticRegimenAct object) {
				return createTularemiaTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseTularemiaTreatmentGivenSubstanceAdministration(TularemiaTreatmentGivenSubstanceAdministration object) {
				return createTularemiaTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTularemiaTreatmentNotGivenSubstanceAdministration(TularemiaTreatmentNotGivenSubstanceAdministration object) {
				return createTularemiaTreatmentNotGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTularemiaPHCRRelevantDxTestsSection(TularemiaPHCRRelevantDxTestsSection object) {
				return createTularemiaPHCRRelevantDxTestsSectionAdapter();
			}
			@Override
			public Adapter caseTularemiaResultOrganizer(TularemiaResultOrganizer object) {
				return createTularemiaResultOrganizerAdapter();
			}
			@Override
			public Adapter caseTularemiaResultObservation(TularemiaResultObservation object) {
				return createTularemiaResultObservationAdapter();
			}
			@Override
			public Adapter caseInfrastructureRoot(InfrastructureRoot object) {
				return createInfrastructureRootAdapter();
			}
			@Override
			public Adapter caseAct(Act object) {
				return createActAdapter();
			}
			@Override
			public Adapter caseClinicalDocument(ClinicalDocument object) {
				return createClinicalDocumentAdapter();
			}
			@Override
			public Adapter casePublicHealthCaseReport(PublicHealthCaseReport object) {
				return createPublicHealthCaseReportAdapter();
			}
			@Override
			public Adapter caseSection(Section object) {
				return createSectionAdapter();
			}
			@Override
			public Adapter caseSocialHistorySection(SocialHistorySection object) {
				return createSocialHistorySectionAdapter();
			}
			@Override
			public Adapter casePhcrSocialHistorySection(PhcrSocialHistorySection object) {
				return createPhcrSocialHistorySectionAdapter();
			}
			@Override
			public Adapter caseClinicalStatement(ClinicalStatement object) {
				return createClinicalStatementAdapter();
			}
			@Override
			public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
				return createCDA_ActAdapter();
			}
			@Override
			public Adapter casePhcrClinicalInformationSection(PhcrClinicalInformationSection object) {
				return createPhcrClinicalInformationSectionAdapter();
			}
			@Override
			public Adapter caseObservation(Observation object) {
				return createObservationAdapter();
			}
			@Override
			public Adapter caseProblemObservation(ProblemObservation object) {
				return createProblemObservationAdapter();
			}
			@Override
			public Adapter caseCaseObservation(CaseObservation object) {
				return createCaseObservationAdapter();
			}
			@Override
			public Adapter caseSignsAndSymptomsObservation(SignsAndSymptomsObservation object) {
				return createSignsAndSymptomsObservationAdapter();
			}
			@Override
			public Adapter casePhcrTreatmentInformationSection(PhcrTreatmentInformationSection object) {
				return createPhcrTreatmentInformationSectionAdapter();
			}
			@Override
			public Adapter caseTherapeuticRegimenAct(TherapeuticRegimenAct object) {
				return createTherapeuticRegimenActAdapter();
			}
			@Override
			public Adapter caseSubstanceAdministration(SubstanceAdministration object) {
				return createSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTreatmentGivenSubstanceAdministration(TreatmentGivenSubstanceAdministration object) {
				return createTreatmentGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseTreatmentNotGivenSubstanceAdministration(TreatmentNotGivenSubstanceAdministration object) {
				return createTreatmentNotGivenSubstanceAdministrationAdapter();
			}
			@Override
			public Adapter caseResultsSection(ResultsSection object) {
				return createResultsSectionAdapter();
			}
			@Override
			public Adapter casePhcrRelevantDxTestsSection(PhcrRelevantDxTestsSection object) {
				return createPhcrRelevantDxTestsSectionAdapter();
			}
			@Override
			public Adapter caseOrganizer(Organizer object) {
				return createOrganizerAdapter();
			}
			@Override
			public Adapter caseResultOrganizer(ResultOrganizer object) {
				return createResultOrganizerAdapter();
			}
			@Override
			public Adapter casePhcr_ResultOrganizer(org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer object) {
				return createPhcr_ResultOrganizerAdapter();
			}
			@Override
			public Adapter caseResultObservation(ResultObservation object) {
				return createResultObservationAdapter();
			}
			@Override
			public Adapter casePhcr_ResultObservation(org.openhealthtools.mdht.uml.cda.phcr.ResultObservation object) {
				return createPhcr_ResultObservationAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport <em>Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseReport
	 * @generated
	 */
	public Adapter createTularemiaCaseReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection <em>PHCR Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRSocialHistorySection
	 * @generated
	 */
	public Adapter createTularemiaPHCRSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct <em>Possible Exposure Location And Type Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPossibleExposureLocationAndTypeAct
	 * @generated
	 */
	public Adapter createTularemiaPossibleExposureLocationAndTypeActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection <em>PHCR Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRClinicalInformationSection
	 * @generated
	 */
	public Adapter createTularemiaPHCRClinicalInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaCaseObservation
	 * @generated
	 */
	public Adapter createTularemiaCaseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaSignsAndSymptomsObservation
	 * @generated
	 */
	public Adapter createTularemiaSignsAndSymptomsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation <em>Location Of Lesion Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.LocationOfLesionObservation
	 * @generated
	 */
	public Adapter createLocationOfLesionObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection <em>PHCR Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRTreatmentInformationSection
	 * @generated
	 */
	public Adapter createTularemiaPHCRTreatmentInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTherapeuticRegimenAct
	 * @generated
	 */
	public Adapter createTularemiaTherapeuticRegimenActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTularemiaTreatmentGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaTreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTularemiaTreatmentNotGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection <em>PHCR Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaPHCRRelevantDxTestsSection
	 * @generated
	 */
	public Adapter createTularemiaPHCRRelevantDxTestsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultOrganizer
	 * @generated
	 */
	public Adapter createTularemiaResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.tularemia.TularemiaResultObservation
	 * @generated
	 */
	public Adapter createTularemiaResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
	 * @generated
	 */
	public Adapter createInfrastructureRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.hl7.rim.Act
	 * @generated
	 */
	public Adapter createActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
	 * @generated
	 */
	public Adapter createClinicalDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport <em>Public Health Case Report</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PublicHealthCaseReport
	 * @generated
	 */
	public Adapter createPublicHealthCaseReportAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Section
	 * @generated
	 */
	public Adapter createSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.SocialHistorySection
	 * @generated
	 */
	public Adapter createSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection <em>Social History Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrSocialHistorySection
	 * @generated
	 */
	public Adapter createPhcrSocialHistorySectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
	 * @generated
	 */
	public Adapter createClinicalStatementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Act
	 * @generated
	 */
	public Adapter createCDA_ActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection <em>Clinical Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrClinicalInformationSection
	 * @generated
	 */
	public Adapter createPhcrClinicalInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Observation
	 * @generated
	 */
	public Adapter createObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation <em>Problem Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ProblemObservation
	 * @generated
	 */
	public Adapter createProblemObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.CaseObservation <em>Case Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.CaseObservation
	 * @generated
	 */
	public Adapter createCaseObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation <em>Signs And Symptoms Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.SignsAndSymptomsObservation
	 * @generated
	 */
	public Adapter createSignsAndSymptomsObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection <em>Treatment Information Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrTreatmentInformationSection
	 * @generated
	 */
	public Adapter createPhcrTreatmentInformationSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct <em>Therapeutic Regimen Act</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TherapeuticRegimenAct
	 * @generated
	 */
	public Adapter createTherapeuticRegimenActAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
	 * @generated
	 */
	public Adapter createSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration <em>Treatment Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTreatmentGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration <em>Treatment Not Given Substance Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.TreatmentNotGivenSubstanceAdministration
	 * @generated
	 */
	public Adapter createTreatmentNotGivenSubstanceAdministrationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultsSection <em>Results Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultsSection
	 * @generated
	 */
	public Adapter createResultsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection <em>Relevant Dx Tests Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.PhcrRelevantDxTestsSection
	 * @generated
	 */
	public Adapter createPhcrRelevantDxTestsSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Organizer <em>Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.Organizer
	 * @generated
	 */
	public Adapter createOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultOrganizer
	 * @generated
	 */
	public Adapter createResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer <em>Result Organizer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ResultOrganizer
	 * @generated
	 */
	public Adapter createPhcr_ResultOrganizerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ccd.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.ccd.ResultObservation
	 * @generated
	 */
	public Adapter createResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.phcr.ResultObservation <em>Result Observation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.openhealthtools.mdht.uml.cda.phcr.ResultObservation
	 * @generated
	 */
	public Adapter createPhcr_ResultObservationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TularemiaAdapterFactory
