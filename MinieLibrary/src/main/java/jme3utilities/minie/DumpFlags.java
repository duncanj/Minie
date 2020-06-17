/*
 Copyright (c) 2019-2020, Stephen Gold
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions are met:
 * Redistributions of source code must retain the above copyright
 notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
 notice, this list of conditions and the following disclaimer in the
 documentation and/or other materials provided with the distribution.
 * Neither the name of the copyright holder nor the names of its contributors
 may be used to endorse or promote products derived from this software without
 specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND
 ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED
 WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE
 FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
 CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE
 OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package jme3utilities.minie;

/**
 * Enumerate the flags used to configure a PhysicsDumper.
 *
 * @author Stephen Gold sgold@sonic.net
 */
public enum DumpFlags {
    // *************************************************************************
    // values

    /**
     * world bounds in spatials
     */
    BoundsInSpatials,
    /**
     * render buckets in spatials
     */
    Buckets,
    /**
     * children in compound collision shapes
     */
    ChildShapes,
    /**
     * clusters in soft bodies
     */
    ClustersInSofts,
    /**
     * cull hints in spatials
     */
    CullHints,
    /**
     * physics joints in rigid bodies
     */
    JointsInBodies,
    /**
     * joints in physics spaces
     */
    JointsInSpaces,
    /**
     * parameters in materials
     */
    MatParams,
    /**
     * motors in joints
     */
    Motors,
    /**
     * nodes in clusters
     */
    NodesInClusters,
    /**
     * native IDs of physics objects
     */
    NativeIDs,
    /**
     * nodes in soft bodies
     */
    NodesInSofts,
    /**
     * material-parameter overrides in spatials
     */
    Overrides,
    /**
     * collision objects in physics spaces
     */
    Pcos,
    /**
     * shadow modes in spatials
     */
    ShadowModes,
    /**
     * transforms in spatials
     */
    Transforms,
    /**
     * user data in spatials
     */
    UserData,
    /**
     * vertex data in geometries
     */
    VertexData;
}