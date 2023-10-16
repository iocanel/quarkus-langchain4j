package io.quarkiverse.langchain4j.runtime.jackson;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import dev.ai4j.openai4j.chat.ChatCompletionResponse;
import dev.ai4j.openai4j.completion.CompletionResponse;
import io.quarkus.jackson.JacksonMixin;

@JacksonMixin(CompletionResponse.Builder.class)
@JsonPOJOBuilder(withPrefix = "")
public abstract class CompletionResponseBuilderMixin {
}
