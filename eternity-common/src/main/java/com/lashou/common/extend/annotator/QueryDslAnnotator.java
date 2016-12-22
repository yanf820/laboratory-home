package com.lashou.common.extend.annotator;

import java.util.EnumSet;
import java.util.Iterator;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.jsonschema2pojo.Annotator;
import org.mongodb.morphia.annotations.Embedded;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.databind.JsonNode;
import com.sun.codemodel.JDefinedClass;
import com.sun.codemodel.JEnumConstant;
import com.sun.codemodel.JFieldVar;
import com.sun.codemodel.JMethod;

public class QueryDslAnnotator implements Annotator {

	private boolean processed;
	private String currentClazz;

	@Override
	public void propertyOrder(JDefinedClass clazz, JsonNode propertiesNode) {
		System.out.println("1:"+ clazz.name());
		clazz=null;
//		ObjectNode on= (ObjectNode) propertiesNode;
//		on.removeAll();
//		System.out.println("");
//		clazz.annotate(Entity.class);

	}

	@Override
	public void propertyInclusion(JDefinedClass clazz, JsonNode schema) {

//		ObjectNode on= (ObjectNode) schema;
//		on.removeAll();
		System.out.println("2:"+ clazz.name());
		// TODO Auto-generated method stub

	}

	@Override
	public void propertyField(JFieldVar field, JDefinedClass clazz, String propertyName, JsonNode propertyNode) {
		System.out.println("3:"+ clazz.name());
		String clazzName = clazz.name();
		if (!clazzName.equals(currentClazz)) {
			processed = false;
			if (propertyName.endsWith("Id") && !processed) {
				field.annotate(Id.class);
				processed = true;
				currentClazz = clazzName;
				return;
			}

		}

		String typeName = field.type().fullName();
		if (!PrimitiveBoxedEnum.isContain(typeName)) {
			field.annotate(Embedded.class);
		}
	}

	public static void main(String[] args) {
	}

	@Override
	public void propertyGetter(JMethod getter, String propertyName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void propertySetter(JMethod setter, String propertyName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void anyGetter(JMethod getter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void anySetter(JMethod setter) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enumCreatorMethod(JMethod creatorMethod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enumValueMethod(JMethod valueMethod) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enumConstant(JEnumConstant constant, String value) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean isAdditionalPropertiesSupported() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void additionalPropertiesField(JFieldVar field, JDefinedClass clazz, String propertyName) {
		// TODO Auto-generated method stub

	}

	enum PrimitiveBoxedEnum {

		Integer("java.lang.Integer"), Long("java.lang.Long"), Short("java.lang.Short"), Byte("java.lang.Byte"), Double(
				"java.lang.Double"), Boolean("java.lang.Boolean"), Float("java.lang.Float"), Character(
						"java.lang.Character"), String("java.lang.String");

		private String tail;

		private PrimitiveBoxedEnum(String val) {
			tail = val;
		}

		private static EnumSet<PrimitiveBoxedEnum> enumSet = EnumSet.allOf(PrimitiveBoxedEnum.class);

		public static EnumSet<PrimitiveBoxedEnum> callEnumSet() {
			return enumSet;
		}

		public static boolean isContain(String sapling) {

			Iterator<PrimitiveBoxedEnum> it = enumSet.iterator();
			while (it.hasNext()) {
				PrimitiveBoxedEnum forest = it.next();
				if (forest.tail.equals(sapling)) {
					return true;
				}
			}
			return false;
		}
	}

}
