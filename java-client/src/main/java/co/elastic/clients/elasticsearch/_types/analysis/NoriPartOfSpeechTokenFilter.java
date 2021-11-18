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

package co.elastic.clients.elasticsearch._types.analysis;

import co.elastic.clients.json.JsonpDeserializable;
import co.elastic.clients.json.JsonpDeserializer;
import co.elastic.clients.json.JsonpMapper;
import co.elastic.clients.json.ObjectBuilderDeserializer;
import co.elastic.clients.json.ObjectDeserializer;
import co.elastic.clients.util.ModelTypeHelper;
import co.elastic.clients.util.ObjectBuilder;
import jakarta.json.stream.JsonGenerator;
import java.lang.String;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import javax.annotation.Nullable;

// typedef: _types.analysis.NoriPartOfSpeechTokenFilter
@JsonpDeserializable
public class NoriPartOfSpeechTokenFilter extends TokenFilterBase implements TokenFilterDefinitionVariant {
	private final List<String> stoptags;

	// ---------------------------------------------------------------------------------------------

	private NoriPartOfSpeechTokenFilter(Builder builder) {
		super(builder);

		this.stoptags = ModelTypeHelper.unmodifiableRequired(builder.stoptags, this, "stoptags");

	}

	public static NoriPartOfSpeechTokenFilter of(Function<Builder, ObjectBuilder<NoriPartOfSpeechTokenFilter>> fn) {
		return fn.apply(new Builder()).build();
	}

	/**
	 * {@link TokenFilterDefinition} variant type
	 */
	@Override
	public String _variantType() {
		return "nori_part_of_speech";
	}

	/**
	 * Required - API name: {@code stoptags}
	 */
	public final List<String> stoptags() {
		return this.stoptags;
	}

	protected void serializeInternal(JsonGenerator generator, JsonpMapper mapper) {

		generator.write("type", "nori_part_of_speech");
		super.serializeInternal(generator, mapper);
		if (ModelTypeHelper.isDefined(this.stoptags)) {
			generator.writeKey("stoptags");
			generator.writeStartArray();
			for (String item0 : this.stoptags) {
				generator.write(item0);

			}
			generator.writeEnd();

		}

	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Builder for {@link NoriPartOfSpeechTokenFilter}.
	 */
	public static class Builder extends TokenFilterBase.AbstractBuilder<Builder>
			implements
				ObjectBuilder<NoriPartOfSpeechTokenFilter> {
		private List<String> stoptags;

		/**
		 * Required - API name: {@code stoptags}
		 */
		public final Builder stoptags(List<String> value) {
			this.stoptags = value;
			return this;
		}

		/**
		 * Required - API name: {@code stoptags}
		 */
		public final Builder stoptags(String... value) {
			this.stoptags = Arrays.asList(value);
			return this;
		}

		@Override
		protected Builder self() {
			return this;
		}

		/**
		 * Builds a {@link NoriPartOfSpeechTokenFilter}.
		 *
		 * @throws NullPointerException
		 *             if some of the required fields are null.
		 */
		public NoriPartOfSpeechTokenFilter build() {
			_checkSingleUse();

			return new NoriPartOfSpeechTokenFilter(this);
		}
	}

	// ---------------------------------------------------------------------------------------------

	/**
	 * Json deserializer for {@link NoriPartOfSpeechTokenFilter}
	 */
	public static final JsonpDeserializer<NoriPartOfSpeechTokenFilter> _DESERIALIZER = ObjectBuilderDeserializer
			.lazy(Builder::new, NoriPartOfSpeechTokenFilter::setupNoriPartOfSpeechTokenFilterDeserializer);

	protected static void setupNoriPartOfSpeechTokenFilterDeserializer(
			ObjectDeserializer<NoriPartOfSpeechTokenFilter.Builder> op) {
		TokenFilterBase.setupTokenFilterBaseDeserializer(op);
		op.add(Builder::stoptags, JsonpDeserializer.arrayDeserializer(JsonpDeserializer.stringDeserializer()),
				"stoptags");

		op.ignore("type");
	}

}
