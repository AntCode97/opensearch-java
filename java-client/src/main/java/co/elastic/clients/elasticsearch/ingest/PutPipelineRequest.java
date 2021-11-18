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

package co.elastic.clients.elasticsearch.ingest;

import co.elastic.clients.elasticsearch._types.ErrorResponse;
import co.elastic.clients.elasticsearch._types.RequestBase;
import co.elastic.clients.elasticsearch._types.Time;
import co.elastic.clients.json.JsonData;
import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.JsonpSerializable;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.transport.Endpoint;
import co.elastic.clients.transport.SimpleEndpoint;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import co.elastic.clients.util.ObjectBuilderBase;
import jakarta.json.stream.JsonGenerator;
import java.lang.Long;
import java.lang.String;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: ingest.put_pipeline.Request
@JsonpDeserializable
public class PutPipelineRequest extends RequestBase implements JsonpSerializable {
	private final Map<String, JsonData> meta;

	@Nullable
	private final String description;

	private final String id;

	@Nullable
	private final Time masterTimeout;

	private final List<Processor> onFailure;

	private final List<Processor> processors;

	@Nullable
	private final Time timeout;

	@Nullable
	private final Long version;

	// ---------------------------------------------------------------------------------------------

	private PutPipelineRequest(Builder builder) {

		this.meta = ModelTypeHelper.unmodifiable(builder.meta);
		this.description = builder.description;
		this.id = ModelTypeHelper.requireNonNull(builder.id, this, "id");
		this.masterTimeout = builder.masterTimeout;
		this.onFailure = ModelTypeHelper.unmodifiable(builder.onFailure);
		this.processors = ModelTypeHelper.unmodifiable(builder.processors);
		this.timeout = builder.timeout;
		this.version = builder.version;

	}

	public static PutPipelineRequest of(Function<Builder, ObjectBuilder<PutPipelineRequest>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * Optional metadata about the ingest pipeline. May have any contents. This map
	 * is not automatically generated by Elasticsearch.
	 * <p>
	 * API name: {@code _meta}
	 */
	public final Map<String, JsonData> meta() {
		return this.meta;
	}

	/**
	 * Description of the ingest pipeline.
	 * <p>
	 * API name: {@code description}
	 */
	@Nullable
	public final String description() {
		return this.description;
	}

	/**
	 * Required - Pipeline ID
	 * <p>
	 * API name: {@code id}
	 */
	public final String id() {
		return this.id;
	}

	/**
	 * Period to wait for a connection to the master node. If no response is
	 * received before the timeout expires, the request fails and returns an error.
	 * <p>
	 * API name: {@code master_timeout}
	 */
	@Nullable
	public final Time masterTimeout() {
		return this.masterTimeout;
	}

	/**
	 * API name: {@code on_failure}
	 */
	public final List<Processor> onFailure() {
		return this.onFailure;
	}

	/**
	 * API name: {@code processors}
	 */
	public final List<Processor> processors() {
		return this.processors;
	}

	/**
	 * Explicit operation timeout
	 * <p>
	 * API name: {@code timeout}
	 */
	@Nullable
	public final Time timeout() {
		return this.timeout;
	}

	/**
	 * API name: {@code version}
	 */
	@Nullable
	public final Long version() {
		return this.version;
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

		if (ModelTypeHelper.isDefined(this.meta)) {
			generator.writeKey("_meta");
			generator.writeStartObject();
			for (Map.Entry<String, JsonData> item0 : this.meta.entrySet()) {
				generator.writeKey(item0.getKey());
				item0.getValue().serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.description != null) {
			generator.writeKey("description");
			generator.write(this.description);

		}
		if (ModelTypeHelper.isDefined(this.onFailure)) {
			generator.writeKey("on_failure");
			generator.writeStartArray();
			for (Processor item0 : this.onFailure) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (ModelTypeHelper.isDefined(this.processors)) {
			generator.writeKey("processors");
			generator.writeStartArray();
			for (Processor item0 : this.processors) {
				item0.serialize(generator, mapper);

			}
			generator.writeEnd();

		}
		if (this.version != null) {
			generator.writeKey("version");
			generator.write(this.version);

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link PutPipelineRequest}.
	 */
	public static class Builder extends ObjectBuilderBase implements ObjectBuilder<PutPipelineRequest> {
		@Nullable
		private Map<String, JsonData> meta;

		@Nullable
		private String description;

		private String id;

		@Nullable
		private Time masterTimeout;

		@Nullable
		private List<Processor> onFailure;

		@Nullable
		private List<Processor> processors;

		@Nullable
		private Time timeout;

		@Nullable
		private Long version;

		/**
		 * Optional metadata about the ingest pipeline. May have any contents. This map
		 * is not automatically generated by Elasticsearch.
		 * <p>
		 * API name: {@code _meta}
		 */
		public final Builder meta(@Nullable Map<String, JsonData> value) {
			this.meta = value;
			return this;
		}

		/**
		 * Description of the ingest pipeline.
		 * <p>
		 * API name: {@code description}
		 */
		public final Builder description(@Nullable String value) {
			this.description = value;
			return this;
		}

		/**
		 * Required - Pipeline ID
		 * <p>
		 * API name: {@code id}
		 */
		public final Builder id(String value) {
			this.id = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(@Nullable Time value) {
			this.masterTimeout = value;
			return this;
		}

		/**
		 * Period to wait for a connection to the master node. If no response is
		 * received before the timeout expires, the request fails and returns an error.
		 * <p>
		 * API name: {@code master_timeout}
		 */
		public final Builder masterTimeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.masterTimeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final Builder onFailure(@Nullable List<Processor> value) {
			this.onFailure = value;
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		public final Builder onFailure(Processor... value) {
			this.onFailure = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code on_failure}
		 */
		@SafeVarargs
		public final Builder onFailure(Function<Processor.Builder, ObjectBuilder<Processor>>... fns) {
			this.onFailure = new ArrayList<>(fns.length);
			for (Function<Processor.Builder, ObjectBuilder<Processor>> fn : fns) {
				this.onFailure.add(fn.apply(new Processor.Builder()).build());
			}
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public final Builder processors(@Nullable List<Processor> value) {
			this.processors = value;
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		public final Builder processors(Processor... value) {
			this.processors = Arrays.asList(value);
			return this;
		}

		/**
		 * API name: {@code processors}
		 */
		@SafeVarargs
		public final Builder processors(Function<Processor.Builder, ObjectBuilder<Processor>>... fns) {
			this.processors = new ArrayList<>(fns.length);
			for (Function<Processor.Builder, ObjectBuilder<Processor>> fn : fns) {
				this.processors.add(fn.apply(new Processor.Builder()).build());
			}
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(@Nullable Time value) {
			this.timeout = value;
			return this;
		}

		/**
		 * Explicit operation timeout
		 * <p>
		 * API name: {@code timeout}
		 */
		public final Builder timeout(Function<Time.Builder, ObjectBuilder<Time>> fn) {
			return this.timeout(fn.apply(new Time.Builder()).build());
		}

		/**
		 * API name: {@code version}
		 */
		public final Builder version(@Nullable Long value) {
			this.version = value;
			return this;
		}

		/**
		 * Builds a {@link PutPipelineRequest}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public PutPipelineRequest build() {
			_checkSingleUse();

			return new PutPipelineRequest(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link PutPipelineRequest}
	 */
	public static final JsonpDeserializer<PutPipelineRequest> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, PutPipelineRequest::setupPutPipelineRequestDeserializer);

	protected static void setupPutPipelineRequestDeserializer(ObjectDeserializer<PutPipelineRequest.Builder> op) {

		op.add(Builder::meta, JsonpDeserializer.stringMapDeserializer(JsonData._DESERIALIZER), "_meta");
		op.add(Builder::description, JsonpDeserializer.stringDeserializer(), "description");
		op.add(Builder::onFailure, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "on_failure");
		op.add(Builder::processors, JsonpDeserializer.arrayDeserializer(Processor._DESERIALIZER), "processors");
		op.add(Builder::version, JsonpDeserializer.longDeserializer(), "version");

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Endpoint "{@code ingest.put_pipeline}".
	 */
	public static final Endpoint<PutPipelineRequest, PutPipelineResponse, ErrorResponse> _ENDPOINT = new SimpleEndpoint<>(
			// Request method
			request -> {
				return "PUT";

			},

			// Request path
			request -> {
				final int _id = 1 << 0;

				int propsSet = 0;

				propsSet |= _id;

				if (propsSet == (_id)) {
					StringBuilder buf = new StringBuilder();
					buf.append("/_ingest");
					buf.append("/pipeline");
					buf.append("/");
					SimpleEndpoint.pathEncode(request.id, buf);
					return buf.toString();
				}
				throw SimpleEndpoint.noPathTemplateFound("path");

			},

			// Request parameters
			request -> {
				Map<String, String> params = new HashMap<>();
				if (request.masterTimeout != null) {
					params.put("master_timeout", request.masterTimeout._toJsonString());
				}
				if (request.timeout != null) {
					params.put("timeout", request.timeout._toJsonString());
				}
				return params;

			}, SimpleEndpoint.emptyMap(), true, PutPipelineResponse._DESERIALIZER);
}
