package com.proceso.entities;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Field;
import org.mongodb.morphia.annotations.Index;
import org.mongodb.morphia.annotations.IndexOptions;
import org.mongodb.morphia.annotations.Indexed;
import org.mongodb.morphia.annotations.Indexes;

@Entity()
@Indexes({
    @Index(fields = { @Field("InputTypeName") })
  }
)
public class InputType extends ObjectEntity {
    @Indexed(options = @IndexOptions(unique = true))
	private String InputTypeName;
	
	public InputType() {
		// TODO Auto-generated constructor stub
	}
	public InputType(String InputTypeName) {
		this.InputTypeName = InputTypeName;
	}
	

	/**
	 * @return the inputTypeName
	 */
	public String getInputTypeName() {
		return InputTypeName;
	}

	/**
	 * @param inputTypeName the inputTypeName to set
	 */
	public void setInputTypeName(String inputTypeName) {
		InputTypeName = inputTypeName;
	}

}
