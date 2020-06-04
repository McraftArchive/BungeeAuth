package org.nocraft.renay.bungeeauth.storage.implementation.custom;

import org.nocraft.renay.bungeeauth.BungeeAuth;
import org.nocraft.renay.bungeeauth.storage.data.DataStorage;

/**
 * A storage provider
 */
@FunctionalInterface
public interface CustomStorageProvider {
    DataStorage provide(BungeeAuth plugin);
}
