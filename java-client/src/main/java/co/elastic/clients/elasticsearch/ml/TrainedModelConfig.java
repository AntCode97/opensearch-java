/*
 * Licensed to Elasticsearch B.V. under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch B.V. licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//----------------------------------------------------
// THIS CODE IS GENERATED. MANUAL EDITS WILL BE LOST.
//----------------------------------------------------

package co.elastic.clients.elasticsearch.ml;

import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.elasticsearch._types.aggregations.InferenceConfig;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Integer;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ml._types.TrainedModelConfig
@JsonpDeserializable
public class TrainedModelConfig implements JsonpSerializable {
	private final String modelId;

	private final List<String> tags;

	@Nullable
	private final String version;

	@Nullable
	private final String compressedDefinition;

	@Nullable
	private final String createdBy;

	@Nullable
	private final Time createTime;

	private final Map<String, String> defaultFieldMap;

	@Nullable
	private final String description;

	@Nullable
	private final Integer estimatedHeapMemoryUsageBytes;

	@Nullable
	private final Integer estimatedOperations;

	private final InferenceConfig inferenceConfig;

	private final TrainedModelConfigInput input;

	@Nullable
	private final String licenseLevel;

	@Nullable
	private final TrainedModelConfigMetadata metadata;

	// ---------------------------------------------------------------------------------------------

	private TrainedModelConfig(Builder builder) {

		this.modelId = ModelTypeHelper.requireNonNull(builder.modelId, this, "modelId");
		this.tags = ModelTypeHelper.unmodifiableRequired(builder.tags, this, "tags");
		this.version = builder.version;
		this.compressedDefinition = builder.compressedDefinition;
		this.createdBy = builder.createdBy;
		this.createTime = builder.createTime;
		this.defaultFieldMap = ModelTypeHelper.unmodifiable(builder.defaultFieldMap);
		this.description = builder.description;
		this.estimatedHeapMemoryUsageBytes = builder.estimatedHeapMemoryUsageBytes;
		this.estimatedOperations = builder.estimatedOperations;
		this.inferenceConfig = ModelTypeHelper.requireNonNull(builder.inferenceConfig, this, "inferenceConfig");
		this.input = ModelTypeHelper.requireNonNull(builder.input, this, "input");
		this.licenseLevel = builder.licenseLevel;
		this.metadata = builder.metadata;

	}

	public static TrainedModelConfig of(Function<Builder, ObjectBuilder<TrainedModelConfig>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - Idetifier for the trained model.
	 * <p>
	 * API name: {@code model_id}
	 */
	public final String modelId() {
		return this.modelId;
	}

	/**
	 * Required - A comma delimited string of tags. A trained model can have many
	 * tags, or none.
	 * <p>
	 * API name: {@code tags}
	 */
	public final List<String> tags() {
		return this.tags;
	}

	/**
	 * The Elasticsearch version number in which the trained model was created.
	 * <p>
	 * API name: {@code version}
	 */
	@Nullable
	public final String version() {
		return this.version;
	}

	/**
	 * API name: {@code compressed_definition}
	 */
	@Nullable
	public final String compressedDefinition() {
		return this.compressedDefinition;
	}

	/**
	 * Information on the creator of the trained model.
	 * <p>
	 * API name: {@code created_by}
	 */
	@Nullable
	public final String createdBy() {
		return this.createdBy;
	}

	/**
	 * The time when the trained model was created.
	 * <p>
	 * API name: {@code create_time}
	 */
	@Nullable
	public final Time createTime() {
		return this.createTime;
	}

	/**
	 * Any field map described in the inference configuration takes precedence.
	 * <p>
	 * API name: {@code default_field_map}
	 */
	public final Map<String, String> defaultFieldMap() {
		return this.defaultFieldMap;
	}

	/**
	 * The free-text description of the trained model.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * The estimated heap usage in bytes to keep the trained model in memory.
	 * <p>
	 * API name: {@code estimated_heap_memory_usage_bytes}
	 */
	@Nullable
	public final Integer estimatedHeapMemoryUsageBytes() {
		return this.estimatedHeapMemoryUsageBytes;
	}

	/**
	 * The estimated number of operations to use the trained model.
	 * <p>
	 * API name: {@code estimated_operations}
	 */
	@Nullable
	public final Integer estimatedOperations() {
		return this.estimatedOperations;
	}

	/**
	 * Required - The default configuration for inference. This can be either a
	 * regression or classification configuration. It must match the underlying
	 * definition.trained_model's target_type.
	 * <p>
	 * API name: {@code inference_config}
	 */
	public final InferenceConfig inferenceConfig() {
		return this.inferenceConfig;
	}

	/**
	 * Required - The input field names for the model definition.
	 * <p>
	 * API name: {@code input}
	 */
	public final TrainedModelConfigInput input() {
		return this.input;
	}

	/**
	 * The license level of the trained model.
	 * <p>
	 * API name: {@code license_level}
	 */
	@Nullable
	public final String licenseLevel() {
		return this.licenseLevel;
	}

	/**
	 * An object containing metadata about the trained model. For example, models
	 * created by data frame analytics contain analysis_config and input objects.
	 * <p>
	 * API name: {@code metadata}
	 */
	@Nullable
	public final TrainedModelConfigMetadata metadata() {
		return this.metadata;
	}

	/**
	 * Serialize this object to JSON.
	 */
	public void serialize(JsonGenerator generator, JsonpMapper mapper) {
		generator.writeStartObject();
		serializeInternal(generator, mapper);
		generator.writeEnd();
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.writeKey("model_id");
		generator.write(this.modelId);

		if (ModelTypeHelper.isDefined(this.tags)) {
			generator.writeKey("tags");
			generator.writeStartArray();
			for (String item0 : this.tags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}
		if (this.compressedDefinition != null) {
			generator.writeKey("compressed_definition");
			generator.write(this.compressedDefinition);

		}
		if (this.createdBy != null) {
			generator.writeKey("created_by");
			generator.write(this.createdBy);

		}
		if (this.createTime != null) {
			generator.writeKey("create_time");
			this.createTime.serialize(generator, mapper);

		}
		if (ModelTypeHelper.isDefined(this.defaultFieldMap)) {
			generator.writeKey("default_field_map");
			generator.writeStartObject();
			for (Map.Entry<String, String> item0 : this.defaultFieldMap.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.write(item0.getValue());

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (this.estimatedHeapMemoryUsageBytes != null) {
			generator.writeKey("estimated_heap_memory_usage_bytes");
			generator.write(this.estimatedHeapMemoryUsageBytes);

		}
		if (this.estimatedOperations != null) {
			generator.writeKey("estimated_operations");
			generator.write(this.estimatedOperations);

		}
		generator.writeKey("inference_config");
		this.inferenceConfig.serialize(generator, mapper);

		generator.writeKey("input");
		this.input.serialize(generator, mapper);

		if (this.licenseLevel != null) {
			generator.writeKey("license_level");
			generator.write(this.licenseLevel);

		}
		if (this.metadata != null) {
			generator.writeKey("metadata");
			this.metadata.serialize(generator, mapper);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link TrainedModelConfig}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<TrainedModelConfig> {
		private String modelId;

		private List<String> tags;

		@Nullable
		private String version;

		@Nullable
		private String compressedDefinition;

		@Nullable
		private String createdBy;

		@Nullable
		private Time createTime;

		@Nullable
		private Map<String, String> defaultFieldMap;

		@Nullable
		private String description;

		@Nullable
		private Integer estimatedHeapMemoryUsageBytes;

		@Nullable
		private Integer estimatedOperations;

		private InferenceConfig inferenceConfig;

		private TrainedModelConfigInput input;

		@Nullable
		private String licenseLevel;

		@Nullable
		private TrainedModelConfigMetadata metadata;

		/**
		 * Required - Idetifier for the trained model.
		 * <p>
		 * API name: {@code model_id}
		 */
		public final Builder modelId(String value) {
			this.modelId = value;
			return this;
		}

		/**
		 * Required - A comma delimited string of tags. A trained model can have many
		 * tags, or none.
		 * <p>
		 * API name: {@code tags}
		 */
		public final Builder tags(List<String> value) {
			this.tags = value;
			return this;
		}

		/**
		 * Required - A comma delimited string of tags. A trained model can have many
		 * tags, or none.
		 * <p>
		 * API name: {@code tags}
		 */
		public final Builder tags(String... value) {
			this.tags = Arrays.asList(value);
			return this;
		}

		/**
		 * The Elasticsearch version number in which the trained model was created.
		 * <p>
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable String value) {
			this.version = value;
			return this;
		}

		/**
		 * API name: {@code compressed_definition}
		 */
		public final Builder compressedDefinition(@Nullable String value) {
			this.compressedDefinition = value;
			return this;
		}

		/**
		 * Information on the creator of the trained model.
		 * <p>
		 * API name: {@code created_by}
		 */
		public final Builder createdBy(@Nullable String value) {
			this.createdBy = value;
			return this;
		}

		/**
		 * The time when the trained model was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final Builder createTime(@Nullable Time value) {
			this.createTime = value;
			return this;
		}

		/**
		 * The time when the trained model was created.
		 * <p>
		 * API name: {@code create_time}
		 */
		public final Builder createTime(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.createTime(fn.apply(new Time.Builder()).build());
		}

		/**
		 * Any field map described in the inference configuration takes precedence.
		 * <p>
		 * API name: {@code default_field_map}
		 */
		public final Builder defaultFieldMap(@Nullable Map<String, String> value) {
			this.defaultFieldMap = value;
			return this;
		}

		/**
		 * The free-text description of the trained model.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * The estimated heap usage in bytes to keep the trained model in memory.
		 * <p>
		 * API name: {@code estimated_heap_memory_usage_bytes}
		 */
		public final Builder estimatedHeapMemoryUsageBytes(@Nullable Integer value) {
			this.estimatedHeapMemoryUsageBytes = value;
			return this;
		}

		/**
		 * The estimated number of operations to use the trained model.
		 * <p>
		 * API name: {@code estimated_operations}
		 */
		public final Builder estimatedOperations(@Nullable Integer value) {
			this.estimatedOperations = value;
			return this;
		}

		/**
		 * Required - The default configuration for inference. This can be either a
		 * regression or classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(InferenceConfig value) {
			this.inferenceConfig = value;
			return this;
		}

		/**
		 * Required - The default configuration for inference. This can be either a
		 * regression or classification configuration. It must match the underlying
		 * definition.trained_model's target_type.
		 * <p>
		 * API name: {@code inference_config}
		 */
		public final Builder inferenceConfig(Function<InferenceConfig.Builder, ObjectBuilder<InferenceConfig>> fn) {
			return this.inferenceConfig(fn.apply(new InferenceConfig.Builder()).build());
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(TrainedModelConfigInput value) {
			this.input = value;
			return this;
		}

		/**
		 * Required - The input field names for the model definition.
		 * <p>
		 * API name: {@code input}
		 */
		public final Builder input(
				Function<TrainedModelConfigInput.Builder, ObjectBuilder<TrainedModelConfigInput>> fn) {
			return this.input(fn.apply(new TrainedModelConfigInput.Builder()).build());
		}

		/**
		 * The license level of the trained model.
		 * <p>
		 * API name: {@code license_level}
		 */
		public final Builder licenseLevel(@Nullable String value) {
			this.licenseLevel = value;
			return this;
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(@Nullable TrainedModelConfigMetadata value) {
			this.metadata = value;
			return this;
		}

		/**
		 * An object containing metadata about the trained model. For example, models
		 * created by data frame analytics contain analysis_config and input objects.
		 * <p>
		 * API name: {@code metadata}
		 */
		public final Builder metadata(
				Function<TrainedModelConfigMetadata.Builder, ObjectBuilder<TrainedModelConfigMetadata>> fn) {
			return this.metadata(fn.apply(new TrainedModelConfigMetadata.Builder()).build());
		}

		/**
		 * Builds a {@link TrainedModelConfig}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public TrainedModelConfig build() {
			_checkSingleUse();

			return new TrainedModelConfig(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link TrainedModelConfig}
	 */
	public static final JsonpDeserializer<TrainedModelConfig> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, TrainedModelConfig::setupTrainedModelConfigDeserializer);

	protected static void setupTrainedModelConfigDeserializer(ObjectDeserializer<TrainedModelConfig.Builder> op) {

		op.add(Builder::modelId, JsonpDeserializer.stringDeserializer(), "model_id");
		op.add(Builder::tags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()), "tags");
		op.add(Builder::version, JsonpDeserializer.stringDeserializer(), "version");
		op.add(Builder::compressedDefinition, JsonpDeserializer.stringDeserializer(), "compressed_definition");
		op.add(Builder::createdBy, JsonpDeserializer.stringDeserializer(), "created_by");
		op.add(Builder::createTime, Time._DESERIALIZER, "create_time");
		op.add(Builder::defaultFieldMap,
				JsonpDeserializer.stringMapDeserializer(JsonpDeserializer.stringDeserializer()), "default_field_map");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::estimatedHeapMemoryUsageBytes, JsonpDeserializer.integerDeserializer(),
				"estimated_heap_memory_usage_bytes");
		op.add(Builder::estimatedOperations, JsonpDeserializer.integerDeserializer(), "estimated_operations");
		op.add(Builder::inferenceConfig, InferenceConfig._DESERIALIZER, "inference_config");
		op.add(Builder::input, TrainedModelConfigInput._DESERIALIZER, "input");
		op.add(Builder::licenseLevel, JsonpDeserializer.stringDeserializer(), "license_level");
		op.add(Builder::metadata, TrainedModelConfigMetadata._DESERIALIZER, "metadata");

	}

}
