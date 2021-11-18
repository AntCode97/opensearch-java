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

package co.elastic.clients.elasticsearch.rollup.get_rollup_index_caps;

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
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: rollup.get_rollup_index_caps.RollupJobSummary
@JsonpDeserializable
public class RollupJobSummary implements JsonpSerializable {
	private final Map<String, List<RollupJobSummaryField>> fields;

	private final String indexPattern;

	private final String jobId;

	private final String rollupIndex;

	// ---------------------------------------------------------------------------------------------

	private RollupJobSummary(Builder builder) {

		this.fields = ModelTypeHelper.unmodifiableRequired(builder.fields, this, "fields");
		this.indexPattern = ModelTypeHelper.requireNonNull(builder.indexPattern, this, "indexPattern");
		this.jobId = ModelTypeHelper.requireNonNull(builder.jobId, this, "jobId");
		this.rollupIndex = ModelTypeHelper.requireNonNull(builder.rollupIndex, this, "rollupIndex");

	}

	public static RollupJobSummary of(Function<Builder, ObjectBuilder<RollupJobSummary>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Required - API name: {@code fields}
	 */
	public final Map<String, List<RollupJobSummaryField>> fields() {
		return this.fields;
	}

	/**
	 * Required - API name: {@code index_pattern}
	 */
	public final String indexPattern() {
		return this.indexPattern;
	}

	/**
	 * Required - API name: {@code job_id}
	 */
	public final String jobId() {
		return this.jobId;
	}

	/**
	 * Required - API name: {@code rollup_index}
	 */
	public final String rollupIndex() {
		return this.rollupIndex;
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

		if (ModelTypeHelper.isDefined(this.fields)) {
			generator.writeKey("fields");
			generator.writeStartObject();
			for (Map.Entry<String, List<RollupJobSummaryField>> item0 : this.fields.entrySet()) {
				generator.writeKey(item0.getKey());
				generator.writeStartArray();
				if (item0.getValue() != null) {
					for (RollupJobSummaryField item1 : item0.getValue()) {
						item1.serialize(generator, mapper);

					}
				}
				generator.writeEnd();

			}
			generator.writeEnd();

		}
		generator.writeKey("index_pattern");
		generator.write(this.indexPattern);

		generator.writeKey("job_id");
		generator.write(this.jobId);

		generator.writeKey("rollup_index");
		generator.write(this.rollupIndex);

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link RollupJobSummary}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<RollupJobSummary> {
		private Map<String, List<RollupJobSummaryField>> fields;

		private String indexPattern;

		private String jobId;

		private String rollupIndex;

		/**
		 * Required - API name: {@code fields}
		 */
		public final Builder fields(Map<String, List<RollupJobSummaryField>> value) {
			this.fields = value;
			return this;
		}

		/**
		 * Required - API name: {@code index_pattern}
		 */
		public final Builder indexPattern(String value) {
			this.indexPattern = value;
			return this;
		}

		/**
		 * Required - API name: {@code job_id}
		 */
		public final Builder jobId(String value) {
			this.jobId = value;
			return this;
		}

		/**
		 * Required - API name: {@code rollup_index}
		 */
		public final Builder rollupIndex(String value) {
			this.rollupIndex = value;
			return this;
		}

		/**
		 * Builds a {@link RollupJobSummary}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public RollupJobSummary build() {
			_checkSingleUse();

			return new RollupJobSummary(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link RollupJobSummary}
	 */
	public static final JsonpDeserializer<RollupJobSummary> _DESERIALIZER = ObjectBuilderDeserializer.lazy(Builder::new,
			RollupJobSummary::setupRollupJobSummaryDeserializer);

	protected static void setupRollupJobSummaryDeserializer(ObjectDeserializer<RollupJobSummary.Builder> op) {

		op.add(Builder::fields, JsonpDeserializer.stringMapDeserializer(
				JsonpDeserializer.arrayDeserializer(RollupJobSummaryField._DESERIALIZER)), "fields");
		op.add(Builder::indexPattern, JsonpDeserializer.stringDeserializer(), "index_pattern");
		op.add(Builder::jobId, JsonpDeserializer.stringDeserializer(), "job_id");
		op.add(Builder::rollupIndex, JsonpDeserializer.stringDeserializer(), "rollup_index");

	}

}
