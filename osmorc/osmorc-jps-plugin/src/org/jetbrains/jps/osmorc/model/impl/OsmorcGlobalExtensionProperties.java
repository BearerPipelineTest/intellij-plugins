package org.jetbrains.jps.osmorc.model.impl;

import com.intellij.util.containers.ContainerUtil;
import com.intellij.util.xmlb.annotations.AbstractCollection;
import org.jetbrains.jps.osmorc.model.JpsFrameworkInstanceDefinition;
import org.jetbrains.jps.osmorc.model.JpsLibraryBundlificationRule;

import java.util.List;

/**
 * @author michael.golubev
 */
public class OsmorcGlobalExtensionProperties {
  @AbstractCollection(elementTag = "frameworkDefinition")
  public List<JpsFrameworkInstanceDefinition> myFrameworkInstanceDefinitions = ContainerUtil.emptyList();

  @AbstractCollection(elementTag = "libraryBundlificationRule")
  public List<JpsLibraryBundlificationRule> myLibraryBundlificationRules = ContainerUtil.emptyList();
}
