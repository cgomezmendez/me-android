package io.forus.me.android.presentation.view.screens.vouchers.provider

import io.forus.me.android.presentation.view.base.lr.PartialChange

sealed class ProviderPartialChanges : PartialChange {

    data class SetAmount(val amount: Float) : ProviderPartialChanges()

    class MakeTransactionStart : ProviderPartialChanges()

    class MakeTransactionEnd : ProviderPartialChanges()

    data class MakeTransactionError(val error: Throwable) : ProviderPartialChanges()

}