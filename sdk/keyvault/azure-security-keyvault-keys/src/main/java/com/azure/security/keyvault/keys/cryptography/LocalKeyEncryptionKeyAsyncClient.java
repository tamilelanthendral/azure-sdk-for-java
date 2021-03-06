// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.security.keyvault.keys.cryptography;

import com.azure.core.cryptography.AsyncKeyEncryptionKey;
import com.azure.core.util.logging.ClientLogger;
import com.azure.security.keyvault.keys.cryptography.models.KeyWrapAlgorithm;
import com.azure.security.keyvault.keys.models.JsonWebKey;
import reactor.core.publisher.Mono;

import static com.azure.core.util.FluxUtil.monoError;

/**
 * A key client which is used to asynchronously encrypt, or wrap, another key.
 */
public final class LocalKeyEncryptionKeyAsyncClient extends LocalCryptographyAsyncClient
    implements AsyncKeyEncryptionKey {

    private final ClientLogger logger = new ClientLogger(LocalKeyEncryptionKeyAsyncClient.class);

    /**
     * Creates a LocalKeyEncryptionKeyAsyncClient for local cryptography operations.
     *
     * @param key the json web key to use for cryptography operations.
     */
    LocalKeyEncryptionKeyAsyncClient(JsonWebKey key) {
        super(key);
    }


    /**
     * Get the identifier of the key to use for cryptography operations.
     *
     * @return A {@link Mono} containing the key identifier.
     */
    @Override
    public Mono<String> getKeyId() {
        return super.getKeyId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<byte[]> wrapKey(String algorithm, byte[] key) {
        try {
            KeyWrapAlgorithm wrapAlgorithm = KeyWrapAlgorithm.fromString(algorithm);
            return wrapKey(wrapAlgorithm, key).flatMap(keyWrapResult -> Mono.just(keyWrapResult.getEncryptedKey()));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Mono<byte[]> unwrapKey(String algorithm, byte[] encryptedKey) {
        try {
            KeyWrapAlgorithm wrapAlgorithm = KeyWrapAlgorithm.fromString(algorithm);
            return unwrapKey(wrapAlgorithm, encryptedKey).flatMap(keyUnwrapResult -> Mono.just(keyUnwrapResult.getKey()));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }
}
