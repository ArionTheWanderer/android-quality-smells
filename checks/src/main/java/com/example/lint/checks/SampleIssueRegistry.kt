package com.example.lint.checks

import com.android.tools.lint.client.api.IssueRegistry
import com.android.tools.lint.detector.api.CURRENT_API

@Suppress("UnstableApiUsage")
class SampleIssueRegistry : IssueRegistry() {
    override val issues = listOf(
        MimDetector.ISSUE_MEMBER_IGNORING_METHOD,
        DwDetector.ISSUE_DURABLE_WAKELOCK,
        IdsDetector.ISSUE_INEFFICIENT_DATA_STRUCTURE,
        IsDetector.ISSUE_INTERNAL_SETTER,
        IgDetector.ISSUE_INTERNAL_GETTER,
        NlmrDetector.ISSUE_NO_LOW_MEMORY_RESOLVER,
        LtDetector.ISSUE_LEAKING_THREAD
    )

    override val api: Int
        get() = CURRENT_API

    override val minApi: Int
        get() = 8
}
