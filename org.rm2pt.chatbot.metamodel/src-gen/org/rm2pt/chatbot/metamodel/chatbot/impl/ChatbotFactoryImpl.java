/**
 */
package org.rm2pt.chatbot.metamodel.chatbot.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.rm2pt.chatbot.metamodel.chatbot.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ChatbotFactoryImpl extends EFactoryImpl implements ChatbotFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChatbotFactory init() {
		try {
			ChatbotFactory theChatbotFactory = (ChatbotFactory) EPackage.Registry.INSTANCE
					.getEFactory(ChatbotPackage.eNS_URI);
			if (theChatbotFactory != null) {
				return theChatbotFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ChatbotFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChatbotFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case ChatbotPackage.ADMIN:
			return createAdmin();
		case ChatbotPackage.CHAT:
			return createChat();
		case ChatbotPackage.MESSAGE:
			return createMessage();
		case ChatbotPackage.NORMAL_USER:
			return createNormalUser();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Admin createAdmin() {
		AdminImpl admin = new AdminImpl();
		return admin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chat createChat() {
		ChatImpl chat = new ChatImpl();
		return chat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalUser createNormalUser() {
		NormalUserImpl normalUser = new NormalUserImpl();
		return normalUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChatbotPackage getChatbotPackage() {
		return (ChatbotPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ChatbotPackage getPackage() {
		return ChatbotPackage.eINSTANCE;
	}

} //ChatbotFactoryImpl
