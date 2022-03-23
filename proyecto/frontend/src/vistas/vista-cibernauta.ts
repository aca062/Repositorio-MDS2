import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-ultimos_exitos';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cancion_cibernauta';
import './vista-cabecera_cibernauta';

@customElement('vista-cibernauta')
export class VistaCibernauta extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; justify-content: space-between;" id="vaadinVerticalLayout">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout1" style="width: 100%;">
  <vista-cabecera_cibernauta id="vistaCabecera_cibernauta"></vista-cabecera_cibernauta>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="height: 100%; width: 100%;">
  <vista-ultimos_exitos id="vistaUltimos_exitos"></vista-ultimos_exitos>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout" style="margin: var(--lumo-space-l);">
   <vista-cancion_cibernauta id="vistaCancion_cibernauta"></vista-cancion_cibernauta>
   <vista-cancion_cibernauta id="vistaCancion_cibernauta4"></vista-cancion_cibernauta>
   <vista-cancion_cibernauta id="vistaCancion_cibernauta3"></vista-cancion_cibernauta>
   <vista-cancion_cibernauta id="vistaCancion_cibernauta2"></vista-cancion_cibernauta>
   <vista-cancion_cibernauta id="vistaCancion_cibernauta1"></vista-cancion_cibernauta>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" style="width: 100%;" id="vaadinVerticalLayout3"></vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
