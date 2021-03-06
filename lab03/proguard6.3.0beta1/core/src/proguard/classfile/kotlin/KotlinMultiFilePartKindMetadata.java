/*
 * ProGuard -- shrinking, optimization, obfuscation, and preverification
 *             of Java bytecode.
 *
 * Copyright (c) 2002-2019 Guardsquare NV
 *
 * This program is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by the Free
 * Software Foundation; either version 2 of the License, or (at your option)
 * any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for
 * more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA
 */
package proguard.classfile.kotlin;

import proguard.classfile.Clazz;
import proguard.classfile.kotlin.visitors.KotlinMetadataVisitor;

import static proguard.classfile.kotlin.KotlinConstants.METADATA_KIND_MULTI_FILE_CLASS_PART;

public class KotlinMultiFilePartKindMetadata
extends KotlinDeclarationContainerMetadata
{
    public String facadeName;
    public Clazz  referencedFacade;


    public KotlinMultiFilePartKindMetadata(int[]  mv,
                                           int[]  bv,
                                           int    xi,
                                           String xs,
                                           String pn)
    {
        super(METADATA_KIND_MULTI_FILE_CLASS_PART, mv, bv, xi, xs, pn);

        this.facadeName = xs;
    }


    @Override
    public void accept(Clazz clazz, KotlinMetadataVisitor kotlinMetadataVisitor)
    {
        kotlinMetadataVisitor.visitKotlinMultiFilePartMetadata(clazz, this);
    }


    // Implementations for Object.
    @Override
    public String toString()
    {
        return "Kotlin file part";
    }
}
